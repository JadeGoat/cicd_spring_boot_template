# Use a Java 21 base image
FROM openjdk:21-jdk-slim
# Copy compiled jar
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar
# Copy env file
COPY .env_docker .env
# Expose ports that container listens on
EXPOSE 8088
EXPOSE 3306
# Start the application
ENTRYPOINT ["java", "-jar", "/app.jar"]