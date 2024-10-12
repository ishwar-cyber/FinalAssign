FROM eclipse-temurin:21-alpine
WORKDIR /app
COPY /target/docker-0.0.1-SNAPSHOT.jar .
EXPOSE 8083
ENTRYPOINT ["java","-jar","-noverify","docker-0.0.1-SNAPSHOT.jar"]