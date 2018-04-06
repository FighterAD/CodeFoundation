# Requisitos funcionales

## Usuarios

#### Requisito: Registro de un usuario.  
**Descripción:** Se registra un usuario con los siguientes atributos (correo electrónico y contraseña).

#### Requisito: Verificación de un usuario.
**Descripción:** Se verifica un usuario mediante el acceso a un enlace enviado a su correo electrónico.

#### Requisito: Identificación de un usuario.  
**Descripción:** Se identifica al usuario con los siguientes atributos (correo electrónico y contraseña).

#### Requisito: Modificación de los datos de un usuario.
**Descripción:** Se modifica los datos de un usuario con los siguientes atributos (nombre, apellidos, fecha de nacimiento (se requiere la autorización de un tutor legal en caso de ser menor de edad), dni, teléfono, dirección, localidad, código postal, ciudad e IBAN).

#### Requisito: Administración de un usuario.
**Descripción:** Se administrará un usuario según las circunstancias del mismo.

## Libros

#### Requisito: Registro de un libro.
**Descripción:** Se registra un libro con los siguientes atributos (nombre y autor).

#### Requisito: Modificación de los datos de un libro.
**Descripción:** Se modifica los datos de un libro con los siguientes atributos (editor, colección, idioma e ISBN).

#### Requisito: Busqueda de un libro.
**Descripción:** Se busca un libro con los siguientes atributos (nombre, autor, editor e ISBN).

#### Requisito: Descripción del estado de un libro.
**Descripción:** Se describe el estado de un libro ()

#### Requisito: Administración de un libro.
**Descripción:** Se administra un libro según las circunstancias del mismo.

#### Requisito: Prestamo de un libro.
**Descripción:** Se presta un libro al usuario solicitante.



- Tomar histórico del préstamo (Usuarios que lo han tenido, fecha, tiempo)

- Enviar mensajes privados entre usuarios (A través de ventana interna del software)

- Registro de búsquedas (Para estadísticas)

- Estado de Libros(Nuevo, buen estado, normal, regular, defectuoso)

- Valoración de usuarios (0-10 se valora el uso de la plataforma)

- Sistema de contacto (Formulario para enviar algún mensaje a los administradores, para cualquier problema o sugerencia)

- Aviso de fecha de devolución (Mensaje automático cuando quedan algunos días para devolver el libro)

* Validación de devolución por parte del usuario que ha prestado el libro. (Se da click en una pestaña y se entrega libro, la otra persona debe confirmar que lo ha recibido)


* Penalizar usuarios (En el caso de cometer infracción se cobra importe y se da de baja cuenta)

* El sistema enviara al usuario un correo con cada modificación o registro nuevo.(A su cuenta asociada)

* El administrador puede cancelar un pedido de libro.(En el caso de que se produzca por error, habrá una breve encuesta para saber motivo para futuras devoluciones)

* La pantalla de registro de pago puede imprimir los datos en pantalla a la impresora.(Un pulsador que se le da y imprime un recibo, esto se produce tanto para entregar como para recoger, posibilidad de descargar en pdf

* El sistema enviará una alerta al administrador del sistema cuando ocurra alguno de los siguientes eventos: Registro de nueva cuenta, ingreso al sistema por parte del cliente, 2 o más intentos fallidos en el ingreso de la contraseña de usuario y cambio de contraseña de usuario.

* Los integrantes del grupo de usuarios de gerentes pueden ingresar y aprobar solicitudes, pero no pueden borrarlas.(Esto solo lo hace el administrador de la aplicación)

* Los integrantes del grupo de usuario de administradores no pueden ingresar o aprobar solicitudes, pero si pueden borrarlas.
