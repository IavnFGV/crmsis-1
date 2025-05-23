#!/usr/bin/env bash


load_lazyapps(){
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
}



install_python3() {
    if ! command -v python3 &> /dev/null
    then
        echo "Python 3 could not be found. Installing..."
        sudo apt-get update
        sudo apt-get install -y python3
    else
        echo "Python 3 is already installed."
    fi

    apt update
    apt install python3-pip -y

    python3 -m ensurepip --default-pip
    python3 -m pip install --upgrade pip
    pip install mysql-connector-python
    pip install python-dotenv
    pip install "textual==0.53.1"
}

create_network() {
    docker network create sb_network
}

create_work_dir() {
    mkdir -p /opt/sb
    mkdir -p /opt/sb/sb_project
    mkdir -p /opt/sb/sb_project/composes
    mkdir -p /opt/sb/sb_project/config
    mkdir -p /opt/sb/sb_project/config/nginx
    mkdir -p /opt/sb/sb_project/config/scripts
    mkdir -p /opt/sb/sb_project/config/mysql
}

copy_files() {
    cp -r ../config/composes/* /opt/sb/sb_project/composes
    cp -r ../config/composes/new_client_app /opt/sb/sb_project/composes/
    cp -r ../config/composes_override/* /opt/sb/sb_project/composes
    cp -r ../config/config/nginx/* /opt/sb/sb_project/config/nginx
    cp -r ../config/config/scripts/* /opt/sb/sb_project/config/scripts
    cp -r ../config/config/mysql/* /opt/sb/sb_project/config/mysql
}

install_yq(){
  sudo wget https://github.com/mikefarah/yq/releases/latest/download/yq_linux_amd64 -O /usr/local/bin/yq
  sudo chmod +x /usr/local/bin/yq
}


load_lazyapps
install_python3
install_yq
create_network
create_work_dir
copy_files

cd /opt/sb/sb_project