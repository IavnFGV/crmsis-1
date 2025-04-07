#!/bin/bash
python3 -m venv venv
source venv/bin/activate
pip install --upgrade pip
pip install -r requirements.txt
echo ""
echo "✅ Virtual environment is ready!"
echo "➡ To activate it: source venv/bin/activate"
echo "➡ To run the app: python new_client.py [add|status]"
