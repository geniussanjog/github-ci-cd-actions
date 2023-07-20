FROM openjdk:17
EXPOSE 8090
ADD target/springboot-ci-cd.jar springboot-ci-cd.jar
ENTRYPOINT["java","-jar","/springboot-ci-cd.jar"]

