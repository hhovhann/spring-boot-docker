# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine
# Add Maintainer Info
MAINTAINER hhovhann <haik.hovhanisyan@gmail.com>
# Create directory and add permission to all
RUN mkdir -p /app
#RUN mkdir -p /app && chmod 777 -R /app
# Defined environment variable
ENV DIRPATH /tmp
## Add a wordking direcotry pointing to /tmp
WORKDIR /app
# Add a volume pointing to /tmp
VOLUME $DIRPATH
# The application's jar file
ARG JAR_FILE
# Copy
COPY ${JAR_FILE} app.jar
## Make port 8080 available to the world outside this container
#EXPOSE 8080
# Run the jar file
ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://hhovhann-mongo:27017/docker", "-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]
