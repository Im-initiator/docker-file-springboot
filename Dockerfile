# syntax=docker/dockerfile:1

#extend image
FROM openjdk:21
#working directory
WORKDIR /app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
#Run mvn to dowload dependency
RUN ./mvnw dependency:go-offline
COPY src ./src
#Run spring boot project
CMD ["./mvnw", "spring-boot:run"]


