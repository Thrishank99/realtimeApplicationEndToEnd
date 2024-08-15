FROM openjdk:17
EXPOSE 8080
ADD target/springboot-endtoend-application.war springboot-endtoend-application.war
ENTRYPOINT ["java","-war","/springboot-endtoend-application.war"]