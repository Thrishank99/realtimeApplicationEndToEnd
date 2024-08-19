FROM openjdk:17
EXPOSE 8080
ADD target/springboot-endtoend-applicationlatest.war springboot-endtoend-applicationlatest.war
ENTRYPOINT ["java","-war","/springboot-endtoend-applicationlatest.war"]