FROM eclipse-temurin:25-jdk AS build
WORKDIR /app
COPY src ./src
RUN javac -d out $(find src -name "*.java")

FROM eclipse-temurin:25-jre
WORKDIR /app
COPY --from=build /app/out ./out
CMD ["java", "-cp", "out", "com.example.Main"]
