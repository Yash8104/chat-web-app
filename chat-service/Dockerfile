FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

COPY target/*.jar chat-service.jar

#TODO: change

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "chat-service.jar"]
