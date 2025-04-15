FROM openjdk:17-jdk-slim

ARG JAR_FILE=build/libs/copsboot-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} app_copsboot.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app_copsboot.jar"]
