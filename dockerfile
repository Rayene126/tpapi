FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ADD target/docker*.jar /app.jar
CMD ["java" , "-jar","/app.jar"]