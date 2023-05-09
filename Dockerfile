FROM openjdk:17

# Set the working directory
WORKDIR /app

# Copy the contents of the current directory to the container at /app
COPY . /app

# Build the Java project
RUN ./mvnw package

# Expose port 8081
EXPOSE 8081

# Run the application
CMD ["java", "-jar", "target/Dentsoft.jar", "--spring.jpa.hibernate.ddl-auto=update"]
