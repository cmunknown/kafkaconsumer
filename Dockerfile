FROM openjdk:11
ADD target/KafkaConsumer.jar KafkaConsumer.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "/KafkaConsumer.jar"]