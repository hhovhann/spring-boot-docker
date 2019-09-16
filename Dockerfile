# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine
# Add Maintainer Info
MAINTAINER hhovhann <haik.hovhanisyan@gmail.com>
# Create directory and add permission to all
#RUN mkdir -p /usr/src/app && chmod 755 /usr/src/app
WORKDIR /usr/src/app
# The application's jar file
ARG JAR_FILE
ARG APPLICATION_PROPERTIES_FILE
# Copy
COPY ${JAR_FILE} /usr/src/app/app.jar
COPY ${APPLICATION_PROPERTIES_FILE} /usr/src/app/application.properties
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]
