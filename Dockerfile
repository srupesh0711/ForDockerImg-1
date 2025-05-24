FROM openjdk:17

COPY target/demoApp.jar  /usr/app/

WORKDIR /usr/app/

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "demoApp.jar"]