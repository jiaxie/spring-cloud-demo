FROM java:8

RUN mkdir /app
WORKDIR /app

COPY ./build/libs/config-1.0-SNAPSHOT.jar /app
EXPOSE 8888
RUN ln -sf config-1.0-SNAPSHOT.jar config-latest.jar
CMD java -jar config-latest.jar