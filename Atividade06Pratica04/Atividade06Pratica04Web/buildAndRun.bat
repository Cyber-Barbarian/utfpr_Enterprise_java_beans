@echo off
call mvn clean package
call docker build -t com.mycompany/Atividade06Pratica04Web .
call docker rm -f Atividade06Pratica04Web
call docker run -d -p 9080:9080 -p 9443:9443 --name Atividade06Pratica04Web com.mycompany/Atividade06Pratica04Web