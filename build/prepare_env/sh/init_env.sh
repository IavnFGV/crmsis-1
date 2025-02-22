#!/usr/bin/env bash


create_network() {
    docker network create sb_network
}

create_work_dir() {
    mkdir /opt/sb
    mkdir /opt/sb/SB-project
    mkdir /opt/sb/SB-project/config
    mkdir /opt/sb/SB-project/config/nginx
    mkdir /opt/sb/SB-project/config/scripts
}

copy_files() {
    cp -r ../../../config/composes/* /opt/sb/SB-project
    cp -r ../../../config/nginx /opt/sb/SB-project/config/nginx
    cp -r ../../../config/scripts /opt/sb/SB-project/config/scripts
}

