#!/usr/bin/env bash


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
    cp -r ../config/nginx* /opt/sb/sb_project/config/nginx
    cp -r ../config/scripts* /opt/sb/sb_project/config/scripts
}

