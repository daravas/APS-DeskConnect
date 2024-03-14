FROM maven:3.8.3-openjdk-17
WORKDIR /app
COPY ./ /app
RUN mvn clean install -DskipTests
EXPOSE 8083
CMD ["mvn", "spring-boot:run"]