FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD /build/libs/aloha-0.0.1-SNAPSHOT.jar aloha.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/aloha.jar"]