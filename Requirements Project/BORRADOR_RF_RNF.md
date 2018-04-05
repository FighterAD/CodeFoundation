### Requisitos funcionales

- Registro de usuarios (Nombre,apellido1,apellido2,fechanac, si es menor de 18 autorización, dni, cuenta bancaria(contacto con banco para pago), telefono,e-mail,direccion para facturacion, pais, ciudad, cpostal)
- Identificación del usuario (Correo electrónico y contraseña)
- Préstamo de libros (Accedes al menú de introducir el libro)
- Tomar histórico del préstamo (Usuarios que lo han tenido, fecha, tiempo)
- Añadir libros para préstamo (Nombre,autor,fecha,ISBN, año de publicación)
- Enviar mensajes privados entre usuarios (A través de ventana interna del software)
- Buscador de libros(Se introduce nombre,autor, fecha, o ISBN y se localiza libro o parecidos)
- Registro de búsquedas (Para estadísticas)
- Estado de Libros(Nuevo, buen estado, normal, regular, defectuoso)
- Valoración de usuarios (0-10 se valora el uso de la plataforma)
- Sistema de contacto (Formulario para enviar algún mensaje a los administradores, para cualquier problema o sugerencia)
- Aviso de fecha de devolución (Mensaje automático cuando quedan algunos días para devolver el libro)
* Validación de devolución por parte del usuario que ha prestado el libro. (Se da click en una pestaña y se entrega libro, la otra persona debe confirmar que lo ha recibido)
* Ficha con datos del libro. (Nombre,autor,fecha,ISBN, año de publicación)
* Administrar fichas (Por parte de la administración, poder editar datos incorrectos o eliminar fichas)
* Penalizar usuarios (En el caso de cometer infracción se cobra importe y se da de baja cuenta)
* El sistema enviara al usuario un correo con cada modificación o registro nuevo.(A su cuenta asociada)
* El administrador puede cancelar un pedido de libro.(En el caso de que se produzca por error, habrá una breve encuesta para saber motivo para futuras devoluciones)
* El campo usuario admite caracteres de todo tipo.(letras, caracteres,números, mayúscula, minúscula, será capaz de distingir)
* La pantalla de registro de pago puede imprimir los datos en pantalla a la impresora.(Un pulsador que se le da y imprime un recibo, esto se produce tanto para entregar como para recoger, posibilidad de descargar en pdf
* El sistema enviará una alerta al administrador del sistema cuando ocurra alguno de los siguientes eventos: Registro de nueva cuenta, ingreso al sistema por parte del cliente, 2 o más intentos fallidos en el ingreso de la contraseña de usuario y cambio de contraseña de usuario.
* Los integrantes del grupo de usuarios de gerentes pueden ingresar y aprobar solicitudes, pero no pueden borrarlas.(Esto solo lo hace el administrador de la aplicación)
* Los integrantes del grupo de usuario de administradores no pueden ingresar o aprobar solicitudes, pero si pueden borrarlas.


### Requisitos no funcionales

---Requisitos de Producto:

--Requisito de Eficiencia
* El sistema debe ser ágil y eficiente en el caso de tener elevada cantidad de usuarios.
* El sistema debe de poder trabajar con varios usuarios a la vez.
* El tiempo de aprendizaje debe ser menor a 5 min para el usuario.
* El sistema debe actualizarse con elevada frecuencia.( la web)

-Requisito de Rendimiento
* Recursos mínimos para poder usar el sistema.(A partir de un ordenador que tenga windows 7/superior, macOS leopard,ios11, Android 7)

-Requisito de Espacio
* Evitar que dos libros iguales tengan distintas fichas(Si hay dos libros idénticos pero cambia ISBN o algún dato en la ficha diferente, se repetirá dentro de la ficha pero esta es única.

--Requisito de Fiabilidad
* Los datos de la base de datos deben ser actualizados con frecuencia.(Así podremos detectar si dos usuarios intentan acceder a la vez al mismo libro).

--Requisito de Portabilidad
* Multiplataforma tanto web como app en el móvil o tablet y distintos sistemas operativos.

--Requisitos de Uso
* Acceso a internet(Debido a que es una plataforma online)
* Es necesario un navegador web(Un acceso ya sea la app a un servidor web)
* Tendremos unos libros públicos para la descarga típicos ademas de ensayos y revistas.
* Interfaz grafica completa.(Todo gráfico, nada por comandos).

---Requisitos de Organización:

--Requisito de Implementación
* Activar cuenta con un ingreso bancario (depósito para cubrir desperfectos)(Mínimo de 20 euros en deposito por si se produce una irregularidad por parte del cliente)


---Requisitos Externos:

--Requisito de Operaciones Internas
* Todos los campos del registro de usuario son obligatorios(En requisitos funcionales viene registro de usuarios)
* Si el nombre de usuario y la contraseña del usuario coinciden podrá acceder a de la web. en caso contrario tendremos un error, y dará opción a recuperar contraseña.(A su vez manda correo al usuario)
* Debe proporcionar mensajes de error informativos y orientados al usuario final.(En cada paso y error que se produzca durante el funcionamiento).

--Requisitos Eticos 
*Establecer una pólitica de funcionamiento de la empresa.

--Requisitos Legislativos
* Edad superior a 18 años o autorización en caso contrario.
* Debemos cumplir con la ley y la normativa a la vez de no revelar datos de usuarios.

-Requisitos de Privacidad
* El usuario puede ver los libros disponibles sin registrarse.(En el caso que desee uno debe registrarse en la web)
* Para utilizar cualquier servicio de la web es necesario registrarse
* Solo ofrecer datos de contacto reales (móvil, teléfono...) en el caso de que se realice transacción. 

-Requisitos de Seguridad
* Si detectamos ataques de seguridad el sistema será bloqueado y avisara a un administrador.
* Todas las conexiones externas con banco y otras empresas deben estar cifradas.








