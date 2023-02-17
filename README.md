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

# Running the tests



## Built With

* [Maven](https://maven.apache.org/) - Dependency Management


## Versioning

version 1.0

## Authors

Sergio Andres Rozo Pulido


