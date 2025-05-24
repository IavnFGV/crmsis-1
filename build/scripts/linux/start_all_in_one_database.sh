#!/usr/bin/env bash

pushd ../../config/composes
echo $pwd
./run_compose.sh sb-b-sql-all_in_one
popd
