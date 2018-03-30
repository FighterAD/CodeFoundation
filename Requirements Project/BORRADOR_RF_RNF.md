### Requisitos funcionales

- Registro de usuarios (Nombre,apellido1,apellido2,fechanac,si es menor de 18 autorización, dni, cuenta bancaria(contacto con banco para pago), telefono,e-mail,direccion para facturacion, pais, ciudad, cpostal)
- Identificación del usuario (Correo electronico y contraseña)
- Préstamo de libros (Accedes al menu de introducir el libro)
- Tomar histórico del préstamo (Usuarios que lo han tenido, fecha, tiempo)
- Añadir libros para préstamo (Nombre,autor,fecha,ISBN, año de publicación)
- Enviar mensajes privados entre usuarios (A través de ventana interna del software)
- Buscador de libros(Se introduce nombre,autor, fecha, o isbn y se localiza libro o parecidos)
- Registro de búsquedas (Para estadísticas)
- Estado de Libros(Nuevo, buen estado, normal, regular, defectuoso)
- Valoración de usuarios (0-10 se valora el uso de la plataforma)
- Sistema de contacto (Formulario para enviar algun mensaje a los administradores, para cualquier problema o sugerencia)
- Aviso de fecha de devolución (Mensaje automático cuando quedan algunos días para devolver el libro)
* Validación de devolución por parte del usuario que ha prestado el libro. (Se da click en una pestaña y se entrega libro, la otra persona debe confirmar que lo ha recibido)
* Ficha con datos del libro. (Nombre,autor,fecha,ISBN, año de publicación)
* Administrar fichas (Por parte de la administración, poder editar datos incorrectos o eliminar fichas)
* Penalizar usuarios (En el caso de cometer infracción se cobra importe y se da de baja cuenta)
* El sistema enviara al usuario un correo con cada modificación o registro nuevo.
* El administrador puede cancelar un pedido de libro.
* El campo usuario admite caracteres de todo tipo.
* La pantalla de registro de pago puede imprimir los datos en pantalla a la impresora.
* El sistema enviará una alerta al administrador del sistema cuando ocurra alguno de los siguientes eventos: Registro de nueva cuenta, ingreso al sistema por parte del cliente, 2 o más intentos fallidos en el ingreso de la contraseña de usuario y cambio de contraseña de usuario.
* Los integrantes del grupo de usuarios de gerentes pueden ingresar y aprobar solicitudes, pero no pueden borrarlas.
* Los integrantes del grupo de usuario de administradores no pueden ingresar o aprobar solicitudes, pero si pueden borrarlas.


### Requisitos no funcionales

* Activar cuenta con un ingreso bancario (depósito para cubrir desperfectos)
* Acceso a internet
* Es necesario un navegador web
* Multiplataforma
* Todos los campos del registro de usuario son obligatorios
* Si el nombre de usuario y la contraseña del usuario coinciden podrá acceder a de la web. en caso contrario tendremos un error, y dará opción a recuperar contraseña.
* El usuario puede ver los libros disponibles sin registrarse.
* Para utilizar cualquier servicio de la web es necesario registrarse
* Evitar que dos libros iguales tengan distintas fichas
* Edad superior a 18 años o autorización.
* Multiplataforma tanto web como app en el móvil o tablet y distintos sistemas operativos.
* Tendremos unos libros públicos para la descarga típicos ademas de ensayos y revistas.
* Si dos libros poseen distinto ISBN y tienen el mismo nombre, ponerlo como el mismo.
* El sistema debe ser ágil y eficiente en el caso de tener elevada cantidad de usuarios.
* El sistema debe de poder trabajar con varios usuarios a la vez.
* Los datos de la base de datos deben ser actualizados con frecuencia.
* Todas las conexiones externas con banco y otras empresas deben estar encifradas.
* Si detectamos ataques de seguridad el sistema será bloqueado y avisara a un administrador.
* El tiempo de aprendizaje debe ser menor a 5 min para el usuario.
* El sistema debe actualizarse con elevada frecuencia.( la web)
* Debe proporcional mensajes de error informativos y orientados al usuario final.
* Interfaz grafica completa.
* Recursos minimos para poder usar el sistema.
* Debemos cumplir con la ley y la normativa a la vez de no revelar datos de usuarios.
* Solo ofrecer datos de contacto reales (móvil, teléfono...) en el caso de que se realice transacción. 
