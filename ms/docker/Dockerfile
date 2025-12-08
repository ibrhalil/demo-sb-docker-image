FROM amazoncorretto:21-alpine3.20-jdk
WORKDIR /app

COPY target/demo-sb-docker-image-0.0.2.jar app.jar

EXPOSE 8070

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
