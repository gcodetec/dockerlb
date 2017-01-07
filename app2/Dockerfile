FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD build/libs/app2-web-content-0.1.0.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
CMD [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar --server.port=$PORT" ]
