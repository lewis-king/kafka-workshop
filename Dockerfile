FROM eclipse-temurin:17-jre
EXPOSE 8080
WORKDIR /application
ARG JAR_FILE=build/libs/*-all.jar
COPY ${JAR_FILE} application/application.jar
CMD ["java", "-Dcom.sun.management.jmxremote", "-jar", "application/application.jar"]
