#!/usr/bin/env bash

# Usage: ./ci.sh ${version}
# Example: ./ci.sh 1

print_status() { echo "$(date +%FT%T.%N%z): ============= $@" 1>&2 ; }

PATH="$PATH:${HOME}/bin"
basedir=$(readlink -e $(dirname $0))
minor_version=$1
directories="gradle"

for directory in ${directories}; do
    if [ -r "${basedir}/${directory}/Dockerfile" ]; then
        "${basedir}/build" "$directory" "${minor_version}"

        if [ $? -ne 0 ]; then
            print_status "Error: Failed to build ${directory} when detect changes"
            exit 1
        fi
    fi
done