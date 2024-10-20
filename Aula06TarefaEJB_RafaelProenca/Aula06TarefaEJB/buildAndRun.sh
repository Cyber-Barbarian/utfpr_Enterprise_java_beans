#!/bin/sh
mvn clean package && docker build -t com.mycompany/Aula06TarefaEJB .
docker rm -f Aula06TarefaEJB || true && docker run -d -p 9080:9080 -p 9443:9443 --name Aula06TarefaEJB com.mycompany/Aula06TarefaEJB