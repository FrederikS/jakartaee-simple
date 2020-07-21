@echo off
call mvn clean package
call docker build -t codes.fdk.samples/jakartaee .
call docker rm -f jakartaee
call docker run -d -p 9080:9080 -p 9443:9443 --name jakartaee codes.fdk.samples/jakartaee