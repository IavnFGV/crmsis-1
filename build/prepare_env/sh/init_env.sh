#!/usr/bin/env bash


create_network() {
    docker network create sb_network
}

create_work_dir() {
    mkdir /opt/sb
}

copy_files() {
    cp -r ../../../config/composes/* /opt/sb/SB-project
    cp -r ../../../config/nginx /opt/sb/SB-project/config/nginx
    cp -r ../../../config/scripts /opt/sb/SB-project/config/scripts
}


create_network
create_work_dir