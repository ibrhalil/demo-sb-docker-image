FROM amazoncorretto:21-alpine3.20-jdk
WORKDIR /app

COPY target/demo-sb-docker-image-1.0.3.jar app.jar

EXPOSE 8070

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
