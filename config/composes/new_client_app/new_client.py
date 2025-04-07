import argparse
import sys

def run_add():
    from commands.add import AddClientApp
    AddClientApp().run()

def run_status():
    from commands.status import StatusApp
    StatusApp().run()

def main():
    parser = argparse.ArgumentParser(description="Client Management CLI")
    parser.add_argument("command", choices=["add", "status"], help="Command to run")
    args = parser.parse_args()

    if args.command == "add":
        run_add()
    elif args.command == "status":
        run_status()
    else:
        print("Unknown command")
        sys.exit(1)

if __name__ == "__main__":
    main()
