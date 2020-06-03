FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/thymeleaf.jar thymeleaf.jar
ENTRYPOINT ["java","-jar","/thymeleaf.jar", "&"]