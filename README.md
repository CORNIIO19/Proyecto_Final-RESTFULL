# Proyecto Final Integración de Sistemas
### Integrantes
- *Vicente García Alfaro* 
- *Diego Barrera Hernández* 
- *Omar Jhonatan Sosa Bobadilla* 

### Descripción del Proyecto 
De acuerdo con la asignación de proyectos en el documento del proyecto final de Integración de Sistemas, se nos asignó la construcción de un sistema de administración de empleados y administración de nóminas.

Como punto de inicio, utilizaremos la arquitectura de 3 capas (3-Layer), en la que separaremos el proyecto en:
- Data Layer 
- Business Layer
- Presentation Layer

### Análisis y Diseño del Proyecto
Para el proyecto utilizamos artefactos hechos en UML para poder comprender de mejor manera el problema que resolveremos. De igual manera, los artefactos que usamos fueron los siguientes:
- Casos de Uso
- Modelo de Dominio
- Diagrama de Clases
- Diagrama Entidad-Relación

***Estos artefactos se podrán encontrar en la carpeta de Documentación.***

### Implementación del Proyecto
El proyecto consiste en un sistema de administración de empleados y administración de nóminas. De manera técnica, al hacer la implementación del proyecto, se utilizaron las siguientes herramientas:

### *Base de Datos:*
- Para la base de datos se utilizó el gestor de base de datos MySQL, el cual nos permitió hacer la creación de las tablas para el almacenamiento de los datos de los empleados y de las nóminas.
***Los *scripts* usados para la creación de la base de datos se encuentran en la carpeta de Servicio Empleado dentro del repositorio, y están nombrados como scripts.sql.***

### *Lenguaje de Programación*
- Como lenguaje de programación se utilizó Java. Al ser la primera vez en usarse, el desarrollo del proyecto nos permitió conocer la sintaxis y además aprender sobre el paradigma de Orientación a Objetos.
- *Framework Backend*: Además de usar Java como lenguaje de programación, se utilizó el framework de Spring Boot, el cual nos permitió hacer la creación de los servicios REST para la comunicación entre el frontend y el backend.
- Las librerías que se usaron para la creación de los servicios son las siguientes:
  - Spring Web
  - Spring Data JPA
  - MySQL Connector Java
***Se puede observar el resultado de la creación de los servicios en las carpetas *Servicio Empleados* y *Servicio Nómina* del repositorio.***

### *Framework Frontend*: 
- Para hacer la integración del frontend y el backend se utilizó el framework de Angular, el cual nos permitió hacer la creación de los componentes para la visualización de los datos de los empleados y de las nóminas. 

### *Documentación del Proyecto*
- Para documentar el proyecto se utilizó la herramienta de Swagger, la cual nos permitió hacer la documentación de los servicios REST que se crearon para la comunicación entre el frontend y el backend.
***La documentación de los servicios REST se puede observar en las siguientes URL:*** 

***Servicio Empleados***
http://localhost:8080/swagger-ui/index.html

***Servicio Nómina***
http://localhost:8081/swagger-ui/index.html

### Pruebas del Proyecto
- Para realizar las pruebas del proyecto se utilizó la herramienta de Postman, la cual nos permitió hacer las pruebas y simulaciones de los métodos *GET*, *POST*, *PUT*, *DELETE* de los servicios REST que se crearon para la comunicación entre el frontend y el backend.

### *Instrucciones de Instalación y Ejecución del Proyecto*:

***Inicialización de la Base de Datos***
- Para ejecutar el proyecto se necesita tener instalado el gestor de base de datos MySQL. Si no se desea crear las tablas manualmente, no es necesario, ya que el proyecto cuenta con la funcionalidad de crear las tablas automáticamente al iniciar. Solo será necesario crear las bases de datos `nomina` y `empleados` en el gestor de base de datos MySQL, y al ejecutar el proyecto, las tablas se crearán automáticamente.

- De igual manera, se necesita cambiar las credenciales de la conexión de la base de datos, las cuales se podrán encontrar en el archivo ***application.properties*** de cada uno de los servicios, en la siguiente ruta:
  - Servicio Empleados: src/main/resources/application.properties
  - Servicio Nómina: src/main/resources/application.properties
y se tendran que cambiar los valores de las siguientes propiedades:
  - spring.datasource.username=*usar el propio*
  - spring.datasource.password=*usar el propio*

***Ejecución de los Servicios (Backend)***
- Como requisitos adicionales, se recomienda tener instalado el JDK de Java 17 y el gestor de paquetes Node.js para poder ejecutar el proyecto en su totalidad.

- Para la ejecución de cada uno de los servicios, se deberá ejecutar el siguiente archivo que contiene el `main` de cada uno de los servicios:
  - Servicio Empleados: ~/Servicio Empleado\employee\src\main\java\cua\uam\mx\EmployeeApplication.java
  - Servicio Nómina: ~\Servicio Nomina\nomina\src\main\java\cua\uam\mx\NominaApplication.java
  - No hay problema si se ejecutan de manera simultánea, ya que cada uno de los servicios tiene su propio puerto de ejecución. El servicio de empleados corre en el puerto 8080 y el servicio de nómina corre en el puerto 8081.

***Ejecución de la Integración (Frontend)***
- Como paso final para la ejecución del frontend, se deberá ejecutar el siguiente comando en la carpeta del proyecto de Angular: 
***ng serve -o***

- Esto abrirá una ventana en el navegador con la aplicación corriendo en el puerto 4200, y de esta manera se podrá observar la aplicación funcionando de manera correcta.

***Estos pasos le permitirán iniciar y ejecutar el proyecto correctamente.***