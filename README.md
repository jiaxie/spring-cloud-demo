
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


## Setup People-Service

```
$ cd people-service
$ ./gradlew clean build
$ ./gradlew bootRun
```
Access the service by opening [http://localhost:8082/person?name=Yotta&sex=Female](http://localhost:8082/person?name=Yotta&sex=Female) in your browser.


## Setup Zuul

```
$ cd people-service
$ ./gradlew clean build
$ ./gradlew bootRun
```
Access the people service by opening [http://localhost:8080/api/people-service/person?name=Yotta&sex=Female](http://localhost:8080/api/people-service/person?name=Yotta&sex=Female) in your browser.
Access the greeting service by opening [http://localhost:8080/api/greeting-service/greeting](http://localhost:8080/api/greeting-service/greeting) in your browser.


## Setup Config Server

```
$ cd config
$ ./gradlew clean build
$ ./gradlew bootRun
```
Access different env configuration properties by [http://localhost:8888/config/dev](http://localhost:8888/config/dev).
The value "dev" can also be "dev", "test", "prod".