@echo off
call mvn clean package
call docker build -t com.mycompany/Aula06TarefaEJB .
call docker rm -f Aula06TarefaEJB
call docker run -d -p 9080:9080 -p 9443:9443 --name Aula06TarefaEJB com.mycompany/Aula06TarefaEJB