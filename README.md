# helloGraphql

_helloGraphql_ es un proyecto desarrollado con el fin de aprender 
como desarrollar una aplicación con kotlin haciendo uso de Graphql para 
la implementación del API. 

Éste proyecto, por comodidad y para agilizar el desarrollo, usa una BBDD Mongodb.

### Pre-requisitos 📋

```
Java 8v
Maven 3.6.0v
Docker 18.09.2v
```

### Instalación 🔧

_helloGraphql_ es un proyecto basado en Maven. Por tanto, para construir este proyecto debemos ejecutar el siguiente comando:

```
mvn clean install
```

## Despliegue 📦

Para levantar el proyecto, en primer lugar, debemos levantar 
un contenedor Docker que contenga la BBDD Mongodb. Para ello ejecutamos el siguiente comando:

```
docker run -d -p 27017:27017 --name hellographql bitnami/mongodb
```

Una vez levantada la BBDD, procedemos a levantar el proyecto:

```
 mvn spring-boot:run
```

## Construido con 🛠️

* [Kotlin](https://kotlinlang.org) 
* [Spring Boot](https://spring.io/projects/spring-boot)
* [Maven](https://maven.apache.org/)
* [MongoDB](https://www.mongodb.com/)
* [GraphQl](https://graphql.org/)

---
⌨️ con ❤️ por [franvallano](https://www.linkedin.com/in/francisco-javier-delgado-vallano-b28b1670/) 😊