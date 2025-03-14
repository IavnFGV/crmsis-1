from templates import read_template


from events_processor import process_events


skip_entities_fields =["ID"]
skip_entities_custom_fields_fields =["KEY","NAME","FIELD_TYPE"]

def to_camel_case(snake_str):
    """Convert snake_case to camelCase"""
    components = snake_str.split('_')
    return components[0] + ''.join(x.title() for x in components[1:])

def generate_entities(entity_names,api_methods):
    result = []
    result_fields = []

    for entity_name in entity_names:
        words = [word[0].upper() + word[1:] for word in entity_name[0:-1].replace("_"," ").lower().split()]
        class_name = "".join(words)+"Entity"
        if class_name == "ActivitieEntity":
            class_name = "ActivityEntity"

        entity_code_header = read_template("entity_code_header")
        entity_code_footer = read_template("entity_code_footer")

        entity_id_pipedrive_integer = read_template("entity_id_pipedrive_integer")
        entity_id_pipedrive_uuid = read_template("entity_id_pipedrive_uuid")

        specific_imports =[]
        specific_fields = []

        before_class_close = []

        class_elements = []

        if entity_name in ("LEADS", "LEAD_LABELS"):
            class_elements.append(entity_code_header)
            class_elements.append(entity_id_pipedrive_uuid)
            specific_imports += ["import java.util.UUID;"]
        else:
            class_elements.append(entity_code_header)
            class_elements.append(entity_id_pipedrive_integer)

        custom_fields_template =""
        if entity_name.endswith("FIELDS"):
            custom_fields_template = read_template("entity_custom_fields_template")
            specific_fields.append(custom_fields_template)



        class_elements.append(custom_fields_template)

        fields =     process_events(entity_name)

        field_declarations =[]
        for key,value in fields.items():
            if(key[0].endswith("_FIELDS")):
                if (key[1].upper() in skip_entities_custom_fields_fields):
                    continue
            if(key[1].upper() in skip_entities_fields):
                    continue
            fieldDeclaration = EntityFieldDeclaration(to_camel_case(key[1]))
            fieldDeclaration.type_name = value[1]
            fieldDeclaration.aux_name_in_dto = key[1]
            annotation = Annotation("Column")
            annotation.params.append(("columnDefinition", value[0]))
            annotation.params.append(("name", key[1].upper()))

            fieldDeclaration.annotations.append(annotation)
            field_declarations.append(fieldDeclaration.to_string())

        class_elements.append("\n".join(field_declarations))

        class_elements.append(entity_code_footer)

        class_code = "\n".join(class_elements)
        class_code = (class_code.replace("$ENTITY_NAME", class_name)
                              .replace("$TABLE_NAME", entity_name)
                              .replace("$SPECIFIC_IMPORTS", "\n".join(specific_imports))
                              .replace("#BEFORE_CLASS_CLOSE", "\n\t".join(before_class_close)))

        result.append((class_name, class_code))

    return result,result_fields


class EntityFieldDeclaration:
    def __init__(self, fieldName):
        self.fieldName = fieldName
        self.type_name=""
        self.annotations = []
        self.visibility = "public"
        self.aux_name_in_dto=""

    def to_string(self):
        annotation_strings = [annotation.to_string() for annotation in self.annotations]
        annotations_part = "\n".join(annotation_strings)
        return f"{annotations_part}\n"\
                f"{self.visibility} {self.type_name} {self.fieldName};"

class Annotation:
    def __init__(self, name):
        self.name = name
        self.params = [] # params in the form of key-value pairs

    def to_string(self):
        params_str = ", ".join(f'{key}="{value}"' for key, value in self.params)
        return f"@{self.name}({params_str})" if self.params else f"@{self.name}"

