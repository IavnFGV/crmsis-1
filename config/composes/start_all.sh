#!/usr/bin/env bash

for file in *.yml; do
    if [[ "$file" != *_ignore.yml && "$file" != *-app-template.yml ]]; then
        docker compose -f "$file" up -d
    fi
done