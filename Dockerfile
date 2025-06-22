FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY . .

RUN ./mvnw clean install -DskipTests
EXPOSE 8080
CMD ["./mvnw", "spring-boot:run"]
