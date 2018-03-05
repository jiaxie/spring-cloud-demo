FROM java:8

RUN mkdir /app
WORKDIR /app
COPY ./build/libs/people-service-1.0-SNAPSHOT.jar /app
EXPOSE 8082
RUN ln -sf people-service-1.0-SNAPSHOT.jar people-service-latest.jar
CMD java -jar people-service-latest.jar