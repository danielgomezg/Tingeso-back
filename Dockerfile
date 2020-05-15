FROM openjdk:11
ADD target/demo-tingeso.jar demo-tingeso.jar
EXPOSE 5000
ENTRYPOINT ["java", "-jar", "demo-tingeso.jar"]