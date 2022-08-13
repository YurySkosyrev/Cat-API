FROM alpine:3.13

RUN apk add openjdk11
COPY ./build/libs/cats-api.jar ./app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]