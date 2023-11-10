FROM openjdk:8-jdk-alpine
WORKDIR /app
COPY target/demo-0.0.1-SNAPSHOT.jar /app/apistudy.jar
EXPOSE 8080
CMD ["java", "-jar", "apistudy.jar"]