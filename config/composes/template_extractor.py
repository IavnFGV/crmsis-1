import re
import glob

def extract_env_variables(file_content):
    # Pattern to match ${VARIABLE_NAME}
    pattern = r'\${([^}]*)}'

    # Find all matches
    matches = re.findall(pattern, file_content)
    return matches

def process_files():
    # Set to store unique variables
    variables = set()

    # Process all yaml and properties files
    for file_path in glob.glob('*.yml') + glob.glob('*.yaml') + glob.glob('*.properties'):
        try:
            with open(file_path, 'r', encoding='utf-8') as file:
                content = file.read()
                found_vars = extract_env_variables(content)
                variables.update(found_vars)

        except Exception as e:
            print(f"Error processing {file_path}: {str(e)}")

    # Sort and print results
    for var in sorted(variables):
        print(f"${{{var}}}")

if __name__ == "__main__":
    process_files()