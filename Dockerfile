FROM maven:3.5-jdk-8-alpine AS build

MAINTAINER tech-tejendra

COPY src /home/app/src
COPY pom.xml /home/app

RUN mkdir -p /var/local/SP

RUN mvn -f /home/app/pom.xml clean package

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/home/app/target/spring-boot-hello-world-0.0.1-SNAPSHOT.jar"]
