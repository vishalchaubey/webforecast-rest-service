# Spring Boot, JWT, Exception Handling, Asynchronous Rest API

Build Restful API for a weather application using Spring Boot.

## Requirements

1. Java - 1.8.x

2. Maven - 3.x.x

## Steps to Setup

**1. Clone the application**

```bash
git clone https://github.com/vishalchaubey/webforecast-rest-service.git
```

**4. Build and run the app using maven**

```bash
mvn package
java -jar target/webforecast-rest-service-1.0.0-SNAPSHOT.jar
```

Alternatively, you can run the app without packaging it using -

```bash
mvn spring-boot:run
```

The app will start running at <http://localhost:8081>.

## Explore Rest APIs

The app defines following APIs.
    
    GET /api/Name/{Name} /* Here name is city Code.*/
    
    GET /api/authenticate/ /* Send username = "vishal" and password="password" for JWT token generations using postman*/
    
You can test them using postman or any other rest client.

## Index page

You can find the web page for this application on below-

<http://localhost:8081/index.html>


## The corresponding application is hosted on AWS EC2 Instance.

The app will running at <http://3.87.55.104>.

## Explore Rest APIs

The app defines following APIs.
    
    GET /api/Name/{Name} /* Here name is city Code.*/

    GET /api/authenticate/ /* Send username = "vishal" and password="password" for JWT token generations using postman*/

## Index page

You can find the web page for this application on below-

<http://3.87.55.104/index.html>


## The corresponding application has also been created using Docker and the image is Available on docker906060/webforecast-service-lates-api.

You can get the image using following command.

    docker pull docker906060/webforecast-service-lates-api.