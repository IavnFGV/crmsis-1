import os

def process_directory(root_dir, output_file):
    with open(output_file, 'w', encoding='utf-8') as out_f:
        for root, _, files in os.walk(root_dir):
            for file in files:
                if file.endswith('.java'):
                    file_path = os.path.join(root, file)
                    try:
                        with open(file_path, 'r', encoding='utf-8') as in_f:
                            out_f.write(f"\n\n// === {file_path} ===\n\n")
                            out_f.write(in_f.read())
                    except Exception as e:
                        print(f"Ошибка: {file_path} ({e})")

if __name__ == "__main__":
    project_dir = input("Путь к проекту: ")
    output_path = "java_combined.txt"
    process_directory(project_dir, output_path)
    print(f"Готово! Файлы объединены в {output_path}")