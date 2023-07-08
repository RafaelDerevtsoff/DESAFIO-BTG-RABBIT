FROM openjdk:17-alpine

WORKDIR /app

COPY build/libs/rabbitmicroservice-0.0.1-SNAPSHOT.jar /app/rabbitmicroservice.jar

ENV POSTGRES_HOST=localhost RABBIT_HOST=rabbitmq

CMD ["java", "-jar", "rabbitmicroservice.jar"]