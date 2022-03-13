# Spring Cloud Config Server/Client interaction

Just a small example to secure the cloud config server with basic authentication and save encrypted password in a config-repository.
Keep in mind you have to provide the server encryption key if you used its api for de/encryption of your password (http://localhost:8080/encrypt). 
Additional you could also use the spring-cli with a different key (more production like).
