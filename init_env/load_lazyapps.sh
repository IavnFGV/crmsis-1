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
    LAZYGIT_VERSION=$(curl -s "https://api.github.com/repos/jesseduffield/lazygit/releases/latest" | \grep -Po '"tag_name": *"v\K[^"]*')
    curl -Lo lazygit.tar.gz "https://github.com/jesseduffield/lazygit/releases/download/v${LAZYGIT_VERSION}/lazygit_${LAZYGIT_VERSION}_Linux_x86_64.tar.gz"
    tar xf lazygit.tar.gz lazygit
    sudo install lazygit -D -t /usr/local/bin/
fi
