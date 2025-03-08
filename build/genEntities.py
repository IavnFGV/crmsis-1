from templates import read_template


def generate_entities(entity_names):
    result = []
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




        class_elements.append(entity_code_footer)


        class_code = "\n".join(class_elements)
        class_code = (class_code.replace("$ENTITY_NAME", class_name)
                                .replace("$TABLE_NAME", entity_name)
                                .replace("$SPECIFIC_IMPORTS", "\n".join(specific_imports))
                                .replace("#BEFORE_CLASS_CLOSE", "\n\t".join(before_class_close)))

        result.append((class_name, class_code))

    return result
