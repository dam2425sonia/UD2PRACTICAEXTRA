# PRACTICA EXTRA
Realiza la siguiente practica.
1. Crea un programa que genere la siguiente estructura de packages y clases: • Tema2
* Common
  * Column
  * DDL
  * DML
* Entities
  * Persona
  * Direccion
* H2
  * Main
* MySQL
  * Main
    
2. Define las clases Persona y Direccion:
* Persona (id, nombre, teléfono,dirección,ArrayList<Direccion>) 
* Direccion(id, idPersona,dirección)

3. Define la clase Column, esta representa una columna de BD. Decide que variables debe contener para generar una nueva columna en la creación de una nueva tabla
Ejemplo: nombre VARCHAR(30) NOT NULL

4. Define la clase DDL, debe contener las funciones:
* Crear tabla, debe recibir por parámetros los datos de la tabla (nombre y columna)
  * Crear ambas tablas
* Actualizar tabla
  * Añade la FK entre Dirección y Persona
* Eliminar tabla
  * Eliminar ambas tablas
    
5. Define la clase DML, debe contener las funciones
* Consultar datos
  * Consultar 1 persona por id
  * Consultar todas las personas
  * Consultas 1 persona por id junto a sus direcciones
* Insertar datos
  * Insertar persona
  * Insertar dirección
* Actualizar datos
  * Modificar una persona
  * Modificar una dirección
* Eliminar datos
  * Eliminar una persona y su dirección
    
6. Debe poder ejecutarse en MySQL y H2, por ello tenemos 2 Main diferentes
