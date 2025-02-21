#!/usr/bin/env bash


create_network() {
    docker network create sb_network
}

create_work_dir() {
    mkdir /opt/sb
}


create_network
create_work_dir