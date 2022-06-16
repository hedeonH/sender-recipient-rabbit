FROM amazoncorretto:11-alpine-jdk
COPY target/micro-collector-1.0.0.jar micro-collector.jar
ENTRYPOINT ["java","-jar","/micro-collector.jar"]