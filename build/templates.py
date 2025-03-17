def read_template(template_name):
    with open(f'templates/{template_name}.java' , 'r', encoding="utf-8") as file:
        return file.read()
