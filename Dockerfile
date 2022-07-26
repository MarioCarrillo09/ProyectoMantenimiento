FROM openjdk:17
ADD target/mario.jar mario.jar
ENTRYPOINT ["java", "-jar","mario.jar"]
