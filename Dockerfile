FROM openjdk:17

WORKDIR /app

# Copy the contents of the current directory to the container at /app
COPY . /app

ARG JAR_FILE=target/Dentsoft.jar

ADD ${JAR_FILE} Dentsoft.jar

# Build the Java project
RUN ./mvnw package

# Expose port 8081
EXPOSE 8081

# Run the application
CMD ["java", "-jar", "target/Dentsoft.jar"]