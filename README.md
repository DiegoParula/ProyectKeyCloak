Descripción del Proyecto
Este proyecto es una aplicación desarrollada en Java con Spring Boot que permite gestionar productos y ventas de la empresa “El Aparato”. Proporciona operaciones CRUD para productos y ventas mediante una base de datos relacional.

La finalidad de este proyecto es poner a prueba los conocimientos en la integración de Keycloak como herramienta de IAM (Identity and Access Management) para gestionar roles, permisos y autenticación de usuarios.

Además, se incluye una colección de Postman para facilitar las pruebas de los endpoints expuestos.

Tecnologías Utilizadas
JDK 17
Spring Boot 3.0.6
MySQL 8 como sistema de gestión de bases de datos (SGBD)
Keycloak para gestión de identidad y accesos
Postman para realizar pruebas de los endpoints
Requisitos Previos
Base de Datos:

Crear una base de datos llamada elaparato.
Ejecutar el archivo SQL proporcionado en partes para poblar la base de datos.
Asegurarse de que el archivo application.properties esté configurado correctamente con los datos de usuario y contraseña de MySQL.

Keycloak:
Tener un servidor Keycloak configurado y en funcionamiento.

Postman:
Importar la colección de Postman incluida en el proyecto para realizar pruebas de los endpoints.

Implementación de Keycloak
1. Configuración de Keycloak
Lo siguiente ya está implementado en el proyecto:

Creación de un Reino: Se creó un Reino llamado el-aparato.
Configuración de Roles:
Vendedor: Permite realizar operaciones CRUD sobre las ventas.
Repositor: Permite realizar operaciones CRUD sobre los productos.
Administrador: Combina los permisos de Vendedor y Repositor.
Los roles están configurados a nivel de Reino y Cliente.
Creación de Usuarios:
Usuario Vendedor: Con acceso a los endpoints de ventas.
Usuario Repositor: Con acceso a los endpoints de productos.
Usuario Administrador: Con acceso a todos los endpoints, incluyendo la administración de usuarios.

Por implementar o verificar:
Reglas de Autenticación:
Configurar Keycloak para que sea obligatorio el login antes de acceder a los endpoints.
Habilitar el registro de nuevos usuarios mediante la opción “New user? Register”.
Endpoints de Administración de Usuarios:
Implementar endpoints que permitan gestionar usuarios desde la aplicación. Solo accesibles por Administradores.

Endpoints de Administración de Usuarios
Se han definido los roles y permisos necesarios. Los endpoints están diseñados para ser accesibles exclusivamente por usuarios con el rol de Administrador.
