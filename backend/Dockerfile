FROM eclipse-temurin:21-alpine
WORKDIR /app
COPY /target/backend-0.0.1-SNAPSHOT.jar .
EXPOSE 8083
ENTRYPOINT ["java","-jar","-noverify","backend-0.0.1-SNAPSHOT.jar"]