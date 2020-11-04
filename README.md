# Getting Started

### About

This is TrueLogic's take home project built using Spring Boot, Apache Kafka and the H2 database engine.

### Setting up Apache Kafka 

This guide is based on the official quickstart guide that you can find [here](https://kafka.apache.org/quickstart).

First, [download](https://www.apache.org/dyn/closer.cgi?path=/kafka/2.6.0/kafka_2.13-2.6.0.tgz) the latest Apache Kafka (2.13-2.6.0 at the time of this writing) release. Then run the following commands:
```
$ tar -xzf kafka_2.13-2.6.0.tgz
$ cd kafka_2.13-2.6.0
```

Then run the following to start all the services:
```
$ bin/zookeeper-server-start.sh config/zookeeper.properties
```

On a different terminal run the following:
```
$ bin/kafka-server-start.sh config/server.properties
```

To create the topic (`novice-players`) run the following in yet a different terminal:
```
$ bin/kafka-topics.sh --create --topic novice-players --bootstrap-server localhost:9092
```

To get the messages published to the topic run the following:
```
$ bin/kafka-console-consumer.sh --topic novice-players --from-beginning --bootstrap-server localhost:9092
```

### Running the Project

To run the project using Maven execute the following:
```
 mvn spring-boot:run
```

Or taking advantage of the Maven wrapper:
On Linux and Mac OS:
```
 ./mvnw spring-boot:run
```
On Windows:
```
 mvnw spring-boot:run

```

By default, the endpoint to which the POST requests should be sent is:
```
localhost:8080/players
```

The default topic name can be changed using the `truelogic.topic` property inside the `application.properties` file.

### Reference Documentation
For further reference, please consider the following sections:

* [Apache Kafka](https://kafka.apache.org)
* [H2 Database Engine](https://www.h2database.com/html/main.html)
* [Spring Boot](https://spring.io/projects/spring-boot)

