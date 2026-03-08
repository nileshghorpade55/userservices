FROM eclipse-temurin:17-jdk
COPY target/user-service.jar user-service.jar
ENTRYPOINT ["java","-jar","/user-service.jar"]