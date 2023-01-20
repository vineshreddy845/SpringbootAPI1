FROM openjdk:11
ADD target/springboot-ap-icicd-docker springdocker.jar
ENTRYPOINT ["java","-jar","/springdocker.jar"]