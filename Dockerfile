FROM openjdk:17-alpine
ADD target/example.jar example.jar
ENTRYPOINT ["java","-jar","example.jar"]
EXPOSE 8080