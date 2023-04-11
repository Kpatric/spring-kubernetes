FROM openjdk:17
EXPOSE 8080
ADD target/spring-kubernetes-0.0.1-SNAPSHOT.jar spring-kubernetes.jar
ENTRYPOINT ["java","-jar","spring-kubernetes.jar"]