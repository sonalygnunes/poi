# Use a suitable base image for Java
FROM openjdk:17-jdk-alpine

# Set the working directory
WORKDIR /app

# Copy the Java application JAR to the container
COPY target/demo-0.0.1-SNAPSHOT.jar /app/demo-0.0.1-SNAPSHOT.jar

# Define the command to run the Java application
CMD ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]

# Expose the port on which the Java application listens (if needed)
EXPOSE 8080

