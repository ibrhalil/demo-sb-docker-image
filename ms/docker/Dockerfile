# ============================
#   BUILD STAGE
# ============================
FROM maven:3.9.9-eclipse-temurin-21 AS builder
WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline -B

COPY src ./src

RUN mvn clean package -DskipTests


# ============================
#   RUNTIME STAGE
# ============================
FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

# Default port
ENV APP_PORT=8070

EXPOSE ${APP_PORT}

# Spring Boot layer
COPY --from=builder /app/target/*.jar app.jar

# Healthcheck
HEALTHCHECK CMD wget -qO- http://localhost:${APP_PORT}/actuator/health || exit 1

ENTRYPOINT ["sh", "-c", "java -jar app.jar --server.port=${APP_PORT}"]
