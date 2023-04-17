FROM adoptopenjdk:17-jre-hotspot

ENV POSTGRES_URL "postgresql://localhost:5432/postgres"
ENV POSTGRES_USER "postgres"
ENV POSTGRES_PASSWORD "postgres"

WORKDIR /app

COPY target/*.jar /app/app.jar

EXPOSE 80