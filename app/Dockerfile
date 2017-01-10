FROM frolvlad/alpine-oraclejdk8:slim
ADD ./build/libs/app-1.0.0.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]