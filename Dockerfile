FROM openjdk:8-alpine

COPY target/uberjar/name_generator.jar /name_generator/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/name_generator/app.jar"]
