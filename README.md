
# spring-cloud-demo

## Setup Eureka

```
$ cd eureka
$ ./gradlew clean build
$ ./gradlew bootRun
```

Review the Eureka monitor by opening [http://localhost:8999](http://localhost:8999) in your browser.

## Setup Greeting-Service

```
$ cd greeting-service
$ ./gradlew clean build
$ ./gradlew bootRun
```
Access the service by opening [http://localhost:8081/greeting/](http://localhost:8081/greeting/) in your browser.