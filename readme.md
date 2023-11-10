## tecnologias
- [x] java 17
- [x] spring boot 3
- [x] spring data jpa
- [x] spring security
- [x] spring web
- [x] lombok
- [x] jwt
- [x] maven

## docker
- [x] openjdk:17-jdk-alpine
- [x] redis
- [x] mysql

## crear target
```bash
./mvnw clean package
## limpiar el target
# ./mvnw clean
## crear el jar
./mvnw clean package -DskipTests
```

## crear imagen docker
```bash
## compilar imagen
docker build -t asin_docker:1.0 .
## correr imagen
docker-compose up
# docker-compose up -d
```