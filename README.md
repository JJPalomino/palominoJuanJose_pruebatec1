# Gestión de Empleados - Prueba Técnica

## Descripción
El objetivo de este proyecto, es evaluar tus conocimientos en Java, incluyendo sintaxis, estructuras repetitivas, estructuras selectivas, manejo de colecciones y operaciones CRUD (Crear, Leer, Actualizar y Borrar)
utilizando JPA (Java Persistence API) para interactuar con una base de datos.

## Requisitos
- Java 17 o superior
- JPA (Java Persistence API) para la interacción con la base de datos
- MySQL o cualquier base de datos compatible con JPA
- Un IDE para desarrollar el código (se recomienda IntelliJ IDEA o Eclipse)

### Requisitos de software:
- JDK 17
- MySQL (o base de datos similar)

- ## Instalación
1. Clona este repositorio:  https://github.com/JJPalomino/palominoJuanJose_pruebatec1.git
2. Navega al directorio del proyecto: palominoJuanJose_pruebatec1
3. Importa el proyecto en tu IDE preferido (IntelliJ IDEA, Eclipse, etc.).
4. Configura la conexión a la base de datos. Asegúrate de que el archivo `persistence.xml` tenga la configuración correcta para la base de datos `empleados`.
5. Crea la base de datos `empleados` usando el archivo SQL proporcionado (ver más abajo).
6. Ejecuta el proyecto y prueba las funcionalidades a través del menú interactivo en consola.

7. ## Uso
Al ejecutar la aplicación, se presentará un menú en consola donde podrás seleccionar las opciones para realizar las operaciones CRUD:
![Captura de pantalla 2024-12-26 103245](https://github.com/user-attachments/assets/a7d9f8ba-5bb2-4575-a0c7-5f9b1859e6e7)

Una vez ejecutada la aplicación, el usuario puede navegar por los diferentes menus y elegir las opciones que necesite.

## Importante
La base de datos está configurada para conectarse por el `puerto 3309`.
No tiene contraseña

## Supuestos

- La base de datos está correctamente configurada y contiene la tabla `empleado` con las columnas necesarias (nombre, apellido, cargo, salario, fecha_inicio).
- El menú en consola es la única forma de interactuar con la aplicación.
- La aplicación maneja errores básicos como la duplicación de empleados o la búsqueda de empleados inexistentes.
- El ingreso de todos los datos del empleado es obligatorio.
- La forma de interactuar con el menú es a travez de `numeros`. 
- Para evitar obligar al usuario a ingresar la fecha en fomrato (yyyy/mm/dd), se pediran los datos de manera independeiente.
- Al borrar un empleado se asume que esta acción no podrá retornarse en un futuro.
- Las `ID` de los empleados son generadas automaticamente.

## Entregables
- Código fuente completo de la aplicación.
- Archivo SQL para crear la base de datos `empleados`.
- Documento con instrucciones para ejecutar y probar la aplicación.

## Licencia

Este proyecto está bajo la Licencia MIT - ver el archivo [LICENSE](LICENSE) para más detalles.
