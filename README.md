# helloGraphql

_helloGraphql_ it's a project developed in order to learn
 how to develop an application with kotlin using Graphql to
 the implementation of the API.

This project, for convenience and to expedite the development, uses a Mongodb DB.

### Requirements 📋

```
Java 8v
Maven 3.6.0v
Docker 18.09.2v
```

### Install 🔧

_helloGraphql_ it's a project based on Maven. Therefore, to build this project we must execute the following command:

```
mvn clean install
```

## Deployment 📦

To deploy the project, first of all, we must deploy
a Docker image that contains the Mongodb DB. For this we execute the following command:

```
docker run -d -p 27017:27017 --name hellographql bitnami/mongodb
```

Once the DB is deployment, we proceed to deploy the project:

```
 mvn spring-boot:run
```

## Build with 🛠️

* [Kotlin](https://kotlinlang.org) 
* [Spring Boot](https://spring.io/projects/spring-boot)
* [Maven](https://maven.apache.org/)
* [MongoDB](https://www.mongodb.com/)
* [GraphQL](https://graphql.org/)

---
⌨️ with ❤️ by [franvallano](https://www.linkedin.com/in/francisco-javier-delgado-vallano-b28b1670/)