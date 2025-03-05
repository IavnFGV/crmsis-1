import os
import re

def extract_methods(file_path):
    with open(file_path, 'r', encoding='utf-8') as file:
        content = file.read()

    print(f"Processing file: {file_path}")



    method_pattern = re.compile(
        r'((?:\s*@(?:[\w.]+)(?:\([^)]*\))?\s*)+)'  # Собираем все аннотации, включая без параметров
        r'\s*(public|private|protected)\s+([\w<>]+)\s+(\w+)\s*'  # Модификатор, возвращаемый тип, название метода
        r'\(((?:\s*@(?:[\w.]+)(?:\([^)]*\))?\s*\w+\s+\w+,?\s*)*)\)\s*\{?',  # Параметры с аннотациями
        re.MULTILINE
    )


    # method_pattern = re.compile(
    #     r'((?:\s*@(?:[\w.]+)(?:\([^)]*\))?\s*)+)'  # Собираем все аннотации, включая без параметров
    #     r'\s*(public|private|protected)\s+([\w<>]+)\s+(\w+)\s*\(([^)]*)\)\s*\{?',  # Сигнатура метода, включая случаи с фигурной скобкой
    #     re.MULTILINE
    # )

    # Регулярное выражение для поиска всех методов вместе с аннотациями (с полным путем)
    # method_pattern = re.compile(
    #     r'((?:\s*@(?:[\w.]+)(?:\([^)]*\))?\s*)+)'
    #     r'(public|private|protected)\s+([\w<>]+)\s+(\w+)\s*\(([^)]*)\)\s*;',
    #     re.MULTILINE
    # )

    matches = method_pattern.findall(content)
    extracted_methods = []

    for match in matches:
        annotations = match[0].strip()
        visibility = match[1].strip()
        return_type = match[2].strip()
        method_name = match[3].strip()
        parameters = match[4].strip()

        print(f"Found method: {method_name}, returns: {return_type}, annotations: {annotations}, parameters: {parameters}")
        extracted_methods.append((annotations, visibility, return_type, method_name, parameters))

    return extracted_methods

def process_directory(directory):
    api_methods = []

    for file_name in os.listdir(directory):
        if file_name.endswith(".java"):
            file_path = os.path.join(directory, file_name)
            methods = extract_methods(file_path)
            if methods:
                api_methods.append((file_name, methods))

    return api_methods

# Указываем путь к директории с API-классами
directory = "D:\\projects\\crmsis-1\\clients-back\\src\\main\\java\\dti\\crmsis\\back\\clients\\openapi\\v1\\api"  # Заменить на фактический путь

api_methods = process_directory(directory)

# Вывод найденных методов
print("\n=== Extracted Methods ===")
for file_name, methods in api_methods:
    print(f"\nFile: {file_name}")
    for annotations, visibility, return_type, method_name, parameters in methods:
        print(f"{annotations}\n{visibility} {return_type} {method_name}({parameters})")
print("\n=======================")
