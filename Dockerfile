FROM amazoncorretto:21-alpine3.18

LABEL author="schando"

ENV PORT=8080

COPY ./target/cpu-intensive-app-0.0.1.jar app.jar

EXPOSE ${PORT}

CMD ["java", "-jar", "/app.jar"]
