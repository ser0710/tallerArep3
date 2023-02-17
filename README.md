# Taller 3

Aplicación que accede a ciertos archivos estaticos por medio del uso de una función lambda 


## Getting Started

### Prerequisites

Git: permite el control de versiones del proyecto

Java: lenguaje en el cual esta desarrollado la totalidad del proyecto

Maven: Software que gestiona proyectos java 


### Installing

Clonamos el repositorio

```
git clone https://github.com/ser0710/tallerArep3.git
```

Entramos en la carpeta donde se encuentra el pom.xml
y ejecutamos

```
mvn clean package exec:java -D"exec.mainClass"="edu.escuelaing.arep.app.app"
```

Una vez veamos el mensaje de "Listo para recbir ..."
entramos al buscador de preferencia
si buscamos la url http://localhost:35000/web.html donde podremos ver una 
pagina html con css incluido y un pequeño fragmento de javascript.
Los otros archivos disponibles son 404.html, 404.js y web.css

## Running the tests

# Pruebas GET

![image](https://user-images.githubusercontent.com/90010904/219526763-11a14ed8-23a9-4808-8ab1-1521ff9a71d7.png)

![image](https://user-images.githubusercontent.com/90010904/219526873-2c313395-f373-4745-9553-8b0dd3a5f178.png)

# Pruebas POST

![image](https://user-images.githubusercontent.com/90010904/219527004-4d0d7dea-532a-4bc8-9477-f75fc3c6bd32.png)


## Built With

* [Maven](https://maven.apache.org/) - Dependency Management


## Versioning

version 1.0

## Authors

Sergio Andres Rozo Pulido


