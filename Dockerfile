FROM openjdk:17.0.2-oracle
MAINTAINER Dmytro Novytskyi <dmytro_novytskyi1@epam.com>

COPY ["target/docker-test-1.0-SNAPSHOT.jar", "docker-test-1.0-SNAPSHOT.jar"]
EXPOSE 8081

ENTRYPOINT ["java", "-jar", "docker-test-1.0-SNAPSHOT.jar"]