import importlib.util
import inspect
import os
import sys

# === Добавляем текущую директорию (где лежит runner) в sys.path ===
current_dir = os.path.dirname(os.path.abspath(__file__))
if current_dir not in sys.path:
    sys.path.insert(0, current_dir)

def load_module_from_file(file_path: str):
    """Загружает модуль из указанного .py файла"""
    module_name = os.path.splitext(os.path.basename(file_path))[0]
    spec = importlib.util.spec_from_file_location(module_name, file_path)
    if spec is None or spec.loader is None:
        raise ImportError(f"Не удалось загрузить модуль из {file_path}")
    module = importlib.util.module_from_spec(spec)
    sys.modules[module_name] = module
    spec.loader.exec_module(module)
    return module

def list_functions(module):
    """Возвращает все пользовательские функции модуля"""
    return [
        (name, func) for name, func in inspect.getmembers(module, inspect.isfunction)
        if func.__module__ == module.__name__
    ]

def prompt_for_arguments(func):
    """Интерактивно запрашивает аргументы для вызова функции"""
    sig = inspect.signature(func)
    args = []
    kwargs = {}
    print(f"\nВведите значения для аргументов функции {func.__name__}:")
    for name, param in sig.parameters.items():
        raw = input(f"  {name} ({param.annotation if param.annotation != inspect.Parameter.empty else 'any'}): ")
        value = eval(raw) if raw.strip() else None
        if param.kind in (inspect.Parameter.POSITIONAL_ONLY, inspect.Parameter.POSITIONAL_OR_KEYWORD):
            args.append(value)
        else:
            kwargs[name] = value
    return args, kwargs

def run_interactive(file_path: str):
    if not os.path.isfile(file_path):
        print("Файл не найден.")
        return

    module = load_module_from_file(file_path)
    functions = list_functions(module)

    if not functions:
        print("В файле не найдено ни одной функции.")
        return

    while True:
        print("\nДоступные функции:")
        for i, (name, _) in enumerate(functions, 1):
            print(f"{i}. {name}")

        try:
            index = int(input("\nВведите номер функции для вызова (0 для выхода): "))
            if index == 0:
                print("Выход.")
                break
            if not (1 <= index <= len(functions)):
                raise ValueError()
        except ValueError:
            print("Некорректный ввод.")
            continue

        name, func = functions[index - 1]
        args, kwargs = prompt_for_arguments(func)
        try:
            result = func(*args, **kwargs)
            print(f"\n✅ Результат функции {name}: {result}")
        except Exception as e:
            print(f"\n❌ Ошибка при выполнении функции: {e}")

        print("\n---")

def main():
    if len(sys.argv) > 1:
        file_path = sys.argv[1]
        print(f"📄 Загружаю модуль из файла: {file_path}")
    else:
        file_path = input("Введите путь к .py файлу: ").strip()
    run_interactive(file_path)

if __name__ == "__main__":
    main()
