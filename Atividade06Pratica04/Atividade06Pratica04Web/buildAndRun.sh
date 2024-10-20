#!/bin/sh
mvn clean package && docker build -t com.mycompany/Atividade06Pratica04Web .
docker rm -f Atividade06Pratica04Web || true && docker run -d -p 9080:9080 -p 9443:9443 --name Atividade06Pratica04Web com.mycompany/Atividade06Pratica04Web