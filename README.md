# Taller 2

Aplicación que permite leer diferentes archivos locales, entre ellos css, HTML y JavaScript por medio de un servidor web teniendo como base de búsqueda el path suministrado. 
Dentro de esta se puede acceder aun a la API de consulta de películas.


## Getting Started

### Prerequisites

Git: permite el control de versiones del proyecto

Java: lenguaje en el cual esta desarrollado la totalidad del proyecto

Maven: Software que gestiona proyectos java 


### Installing

Clonamos el repositorio

```
git clone https://github.com/ser0710/tallerArep2.git
```

Entramos en la carpeta donde se encuentra el pom.xml
y ejecutamos

```
mvn clean package exec:java -D"exec.mainClass"="edu.escuelaing.arep.app.app"
```

Una vez veamos el mensaje de "Listo para recbir ..."
entramos al buscador de preferencia
si buscamos la url http://localhost:35000/web podremos acceder al buscador de 
peliculas, el cual contiene sus funcionalidades en un archivo JS, cuenta
con una imagen de ejemplo y un sencillo css. En caso de agregar una url no 
valida veremos un mensaje de pagina no encontrada.


## Built With

* [Maven](https://maven.apache.org/) - Dependency Management


## Versioning

version 1.0

## Authors

Sergio Andres Rozo Pulido


