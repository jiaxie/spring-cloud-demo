FROM java:8

RUN mkdir /app
WORKDIR /app
COPY ./build/libs/eureka-1.0-SNAPSHOT.jar /app
EXPOSE 8999
RUN ln -sf eureka-1.0-SNAPSHOT.jar eureka-latest.jar
CMD java -jar eureka-latest.jar