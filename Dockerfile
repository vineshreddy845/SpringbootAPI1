FROM openjdk:11
ADD target/SpringbootAPI1-0.0.1-SNAPSHOT.jar springdocker.jar
ENTRYPOINT ["java","-jar","/springdocker.jar"]