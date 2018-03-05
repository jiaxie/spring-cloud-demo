FROM java:8

RUN mkdir /app
WORKDIR /app
COPY ./build/libs/greeting-service-1.0-SNAPSHOT.jar /app
EXPOSE 8081
RUN ln -sf greeting-service-1.0-SNAPSHOT.jar greeting-service-latest.jar
CMD java -jar greeting-service-latest.jar