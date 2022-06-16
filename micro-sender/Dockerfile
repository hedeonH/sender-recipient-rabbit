FROM amazoncorretto:11-alpine-jdk
COPY target/micro-sender-1.0.0.jar micro-sender.jar
ENTRYPOINT ["java","-jar","/micro-sender.jar"]