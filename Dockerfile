FROM maven:latest
LABEL authors="meemmi"

WORKDIR /app
COPY pom.xml /app
COPY . /app
RUN mvn package
CMD ["java", "-jar", "target/ShoppingCart-1.0.jar"]