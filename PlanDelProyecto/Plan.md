# - Introducción

En el documento presente definimos todos los aspectos a destacar sobre el curso del desarrollo del proyecto.


# - Objetivos

El objetivo del plan del proyecto consiste en definir todos los objetivos a alcanzar del mismo, así como informar a las distintas partes integrantes del grupo sobre todos los aspectos a destacar.


# - Alcance del proyecto

A continuación definiremos los requisitos que se van a implementar, y los que no, a lo largo del desarrollo del proyecto.

# Requisitos funcionales


## Usuarios

- [x] **Registro de un usuario**  
  **Descripción:** Se registra un usuario con los siguientes atributos (correo electrónico y contraseña).

- [x] **Verificación de un usuario**  
  **Descripción:** Se verifica un usuario mediante el acceso a un enlace enviado a su correo electrónico.

- [x] **Identificación de un usuario**  
**Descripción:** Se identifica al usuario con los siguientes atributos (correo electrónico y contraseña).

- [x] **Modificación de los datos de un usuario**  
**Descripción:** Se modifica los datos de un usuario con los siguientes atributos (nombre, apellidos, fecha de nacimiento (se requiere la autorización de un tutor legal en caso de ser menor de edad), dni, teléfono, dirección, localidad, código postal, ciudad e IBAN).

- [x] **Valoración de un usuario**  
**Descripción:** Se valora un usuario mediante un sistema de puntuación del sistema.

- [x] **Administración de un usuario**  
**Descripción:** Se administrará un usuario según las circunstancias del mismo.


## Libros

- [x] **Registro de un libro**  
**Descripción:** Se registra un libro con los siguientes atributos (nombre y autor).

- [x] **Modificación de los datos de un libro**  
**Descripción:** Se modifica los datos de un libro con los siguientes atributos (editor, colección, idioma e ISBN).

- [x] **Valoración de un libro**  
**Descripción:** Se valora un libro mediante un sistema de puntiación del sistema. 

- [x] **Registro de uso de un libro**  
**Descripción:** Se registra los usuarios que hayan tenido acceso al libro.

- [x] **Descripción del estado de un libro**  
**Descripción:** Se describe el estado de un libro (deficiente, aceptablem y óptimo)

- [x] **Busqueda de un libro**  
**Descripción:** Se busca un libro con los siguientes atributos (nombre, autor, editor e ISBN).

- [x] **Administración de un libro**  
**Descripción:** Se administra un libro según las circunstancias del mismo.


## Sistema

- [x] **Comunicación entre usuarios**  
**Descripción:** Comunicación entre usuarios para informar de la solicitud de prestamo del libro solicitado.

- [x] **Prestamo de un libro**  
**Descripción:** Se presta un libro al usuario solicitante por parte del usuario prestador.

- [x] **Devolución de un libro**  
**Descripción:** Se devuelve un libro al usuario prestador por parte del usuario solicitante.

- [x] **Administración de un prestamo**  
**Descripción:** Se administra un prestamo según las circunstancias del mismo. 


# Requisitos no funcionales

* Todos los campos del registro de usuario son obligatorios
* Comprobar los datos de usuario a la hora de ingresar
* Edad superior
* Aceptar Terminos Legales

  
# - Arquitectura y Plataforma 

En cuanto a la arquitectura a utilizar, utilizaremos una arquitectura Modelo Vista Controlador. Por otra parte, las plataformas a usar son Java y PLSQL.

# - Plataforma de desarrollo

La plataforma de desarrollo escogida para desarrollar el proyecto es NetBeans.


# - Organización del proyecto

A continuación se puede apreciar los integrantes del grupo a cargo del desarrollo del proyecto, así como sus roles. La comunicación entre los mismos se realiza gracias a servicios de mensajeria instantanea.

# Miembros

## Project Manager

* Artem Pavlenko


## Project Managers

* Artem Pavlenko
* Ana Rodríguez-Rabadán Gómez-Pimpollo
* Jesús Pulido Vázquez
* Andriy Dyachuk


## Documentation Managers

* Artem Pavlenko
* Pedro Antonio Aguilar Lima
* Alejandro Fuster López
* Jesús Pulido Vázquez


## Developers

* José Antonio Ruiz Castelló
* Alejandro Fuster López
* Frank Leandro Mejías Cervantes
* Ana Rodríguez-Rabadán Gómez-Pimpollo


## Test Managers

* Pedro Antonio Aguilar Lima
* José Antonio Ruiz Castelló
* Frank Leandro Mejías Cervantes
* Andriy Dyachuk
