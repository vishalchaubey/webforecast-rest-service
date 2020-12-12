FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD target/webforecast-rest-service-1.0.0-SNAPSHOT.jar webforecast-rest-service-1.0.0-SNAPSHOT.jar
ENTRYPOINT java -jar webforecast-rest-service-1.0.0-SNAPSHOT.jar