#!/usr/bin/env bash

# Load lazydocker

if [ -f /usr/local/bin/lazydocker ]; then
    echo "lazydocker is already installed"
else
    echo "Installing lazydocker"
    export DIR=/usr/local/bin
    curl https://raw.githubusercontent.com/jesseduffield/lazydocker/master/scripts/install_update_linux.sh | bash
fi

# Load lazygit

if [ -f /usr/local/bin/lazygit ]; then
    echo "lazygit is already installed"
else
    echo "Installing lazygit"
    export DIR=/usr/local/bin
    curl https://raw.githubusercontent.com/jesseduffield/lazygit/master/scripts/install_update_linux.sh | bash
fi
