FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Add the JAR file from the target directory to the working directory in the container
ADD target/SampleSpringBootProject-0.0.1-SNAPSHOT.jar /app/SampleSpringBootProject-0.0.1-SNAPSHOT.jar

# Expose port 8080
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "SampleSpringBootProject-0.0.1-SNAPSHOT.jar"]
