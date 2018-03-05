FROM java:8

RUN mkdir /app
WORKDIR /app
COPY ./build/libs/zuul-1.0-SNAPSHOT.jar /app
EXPOSE 8080
RUN ln -sf zuul-1.0-SNAPSHOT.jar zuul-latest.jar
CMD java -jar zuul-latest.jar