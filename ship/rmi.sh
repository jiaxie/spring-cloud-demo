#!/usr/bin/env bash

images="eureka config zuul greeting-service people-service"

echo "Starting to remove images: ${images}"

for image in ${images}; do
    docker rmi --force "spring-cloud-demo/${image}"
done

