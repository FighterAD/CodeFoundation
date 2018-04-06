### Introduccion 
  En este documento definimos todos los aspectos relevantes a cerca del proyecto.
  

### Objetivo de Plan 
  Ayudar en el desarrollo para alcanzar todos los objetivos definidos, asi como que todos los integrantes del grupo sepan del alcance y las partes relevantes del proyecto.


### Alcance del Proyecto
  En este punto definimos los requisitos que se implementaran en el proyecto.
  
  ## Requisitos Funcionales
  
  * Registro de usuario
    * Crear un usuario con los siguientes campos en la base de datos:  Nombre,Apellido1, Apellido2,FechaNacimiento,Autorización,DNI,CuentaBancaria,Teléfono,e-mail,DirecciónFacturación,País,Ciudad,CódigoPostal. La clave primaria sería DNI, y la autorización obligatoria en caso de que la edad sea menor de 18 años.
  * Ingreso de usuario
    * Login del Usuario mediante correo electrónico y contraseña. 
  * Modificar de los datos de un usuario
    * Actualizar cualquiera de los campos anteriormente hablados que el usuario requiera.
  * Añadir un libro
    * Posibilidad de crear una ficha de un libro con los siguientes campos en la base de datos: Nombre,Autor,Fecha,ISBN, AñoPublicación.
  * Modificar los datos de un libro
    * Al igual que los datos de usuario, poder modificar los campos de la ficha en la base de datos.
  * Buscar un libro
    * Implementar un buscador para realizar búsquedas de libros en la base de datos.
  * Consultar los datos de un libro
    * Mostrar los diferentes datos almacenados sobre un libro.
  * Solicitar un libro
    * Posibilidad de pedirle un libro a otro usuario. 


  ## Requisitos No Funcionales

  * Todos los campos del registro de usuario son obligatorios
  * Comprobar los datos de usuario a la hora de ingresar
  * Edad superior
  * Aceptar Terminos Legales

  
### Arquitectura y Plataforma 
  Utilizaremos una arquitectura Modelo Vista Controlador, Java, Mysql.
  
### Plataforma de desarrollo
    Como plataforma utilizaremos Netbeans la version mas reciente. 
    
### Organizacion de Proyecto
  En este apartado definimos la organizacion y los roles.
  Los mensajes urgentes y la comuncacion con los miembros del grupo se realizara por WhatsApp.
  Las tareas asi como el reparto de estas se realizara medediante el trello.
  En la primera columna se pondra informacion relevante dicha por profesor sobre el proyecto.
lectura.



Estructura de equipo.

### Project Manager

* Artem Pavlenko


### Project Managers

* Artem Pavlenko
* Ana Rodríguez-Rabadán Gómez-Pimpollo
* Jesús Pulido Vázquez
* Andriy Dyachuk


### Documentation Managers

* Artem Pavlenko
* Pedro Antonio Aguilar Lima
* Alejandro Fuster López
* Jesús Pulido Vázquez


### Developers

* José Antonio Ruiz Castelló
* Alejandro Fuster López
* Frank Leandro Mejías Cervantes
* Ana Rodríguez-Rabadán Gómez-Pimpollo


### Test Managers

* Pedro Antonio Aguilar Lima
* José Antonio Ruiz Castelló
* Frank Leandro Mejías Cervantes
* Andriy Dyachuk
