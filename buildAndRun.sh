#!/bin/sh
mvn clean package && docker build -t codes.fdk.samples/jakartaee .
docker rm -f jakartaee || true && docker run -d -p 9080:9080 -p 9443:9443 --name jakartaee codes.fdk.samples/jakartaee