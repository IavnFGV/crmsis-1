#!/usr/bin/env bash


install_python3() {
    if ! command -v python3 &> /dev/null
    then
        echo "Python 3 could not be found. Installing..."
        sudo apt-get update
        sudo apt-get install -y python3
    else
        echo "Python 3 is already installed."
    fi

    python3 -m ensurepip --default-pip
    python3 -m pip install --upgrade pip
    pip install mysql-connector-python
    pip install python-dotenv
}

create_network() {
    docker network create --if-not-exists sb_network
}

create_work_dir() {
    mkdir -p /opt/sb
    mkdir -p /opt/sb/sb_project
    mkdir -p /opt/sb/sb_project/config
    mkdir -p /opt/sb/sb_project/config/nginx
    mkdir -p /opt/sb/sb_project/config/scripts
}

copy_files() {
    cp -r ../config/composes/* /opt/sb/sb_project
    cp -r ../config/nginx/* /opt/sb/sb_project/config/nginx
    cp -r ../config/scripts* /opt/sb/sb_project/config/scripts
}

install_python3
create_network
create_work_dir
copy_files