# Requisitos no funcionales

## Requisitos del producto

### Requisitos de eficiencia
* El sistema debe ser ágil y eficiente en el caso de tener una elevada cantidad de usuarios.
* El sistema debe de poder trabajar con varios usuarios a la vez.
* El tiempo de aprendizaje debe ser menor de 5 min para el usuario.
* El sistema debe actualizarse con elevada frecuencia.

### Requisitos de rendimiento
* Recursos mínimos para poder usar el sistema.

### Requisitos de espacio
* Evitar que dos libros iguales tengan distintas fichas. (Si hay dos libros idénticos pero cambia el ISBN o algún dato en la 
  ficha es diferente, se repetirá dentro de la ficha pero esta es única).

### Requisitos de fiabilidad
* Los datos de la base de datos deben ser actualizados con frecuencia. (Podremos detectar si dos usuarios intentan acceder a
  la vez al mismo libro).

### Requisito de portabilidad
* Multiplataforma tanto web como app en el móvil o tablet y distintos sistemas operativos.

### Requisitos de uso
* Acceso a internet.
* Es necesario un navegador web.
* Tendremos unos libros públicos para la descarga típicos ademas de ensayos y revistas.
* Interfaz grafica completa.


## Requisitos externos:

### Requisito de operaciones internas
* Todos los campos del registro de usuario son obligatorios. (En requisitos funcionales viene registro de usuarios).
* Si el nombre de usuario y la contraseña del usuario coinciden podrá acceder a de la web, en caso contrario tendremos un
  error, y dará opción a recuperar contraseña. (A su vez manda correo al usuario).
* Debe proporcionar mensajes de error informativos y orientados al usuario final. (En cada paso y error que se produzca
  durante el funcionamiento).

### Requisitos eticos  
* Establecer una pólitica de funcionamiento de la empresa.

### Requisitos legislativos
* Edad superior a 18 años o autorización en caso contrario.
* Debemos cumplir con la ley y la normativa a la vez de no revelar datos de usuarios.

### Requisitos de privacidad
* El usuario puede ver los libros disponibles sin registrarse. (En el caso que desee uno debe registrarse en la web).
* Para utilizar cualquier servicio de la web es necesario registrarse.
* Solo ofrecer datos de contacto reales.

### Requisitos de seguridad
* Si detectamos ataques de seguridad el sistema será bloqueado y avisara a un administrador.
* Todas las conexiones externas deben estar cifradas.
