# Build stage
FROM maven:3.8.4-openjdk-11-slim AS build
WORKDIR /app
# Cache Maven dependencies
COPY pom.xml .
RUN mvn dependency:go-offline
# Build the application
COPY src ./src
RUN mvn clean package -DskipTests
# Run stage
FROM openjdk:11-jre-slim
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
