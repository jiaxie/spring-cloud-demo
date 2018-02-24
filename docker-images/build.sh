#!/usr/bin/env bash

# Usage: ./build.sh ${dir} ${version}
# Example: ./build.sh gradle 1

print_status() { echo "$(date +%FT%T.%N%z): ============= $@" 1>&2 ; }

base_dir=$(dirname $(readlink -e $0))
dockerfile_dir=$(readlink -e "${base_dir}/$1")
docker_repository="spring-cloud-demo/$1"
docker_tag="1.$2"

print_status "Building docker image: ${docker_repository}:${docker_tag}"
docker build --no-cache -t "${docker_repository}:${docker_tag}" "${dockerfile_dir}"

