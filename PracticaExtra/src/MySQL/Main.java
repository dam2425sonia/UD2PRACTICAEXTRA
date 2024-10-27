package MySQL;

import Common.Column;
import Common.DDL;
import Common.DML;
import Entities.Persona;
import Entities.Direccion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/ud2pextra";
        String user = "root";
        String password = "Dam2425*";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            DDL ddl = new DDL();
            DML dml = new DML();

            // Crear tablas
            ArrayList<Column> columnasPersona = new ArrayList<>();
            columnasPersona.add(new Column("id", "INT PRIMARY KEY", true));
            columnasPersona.add(new Column("nombre", "VARCHAR(50)", true));
            columnasPersona.add(new Column("telefono", "VARCHAR(15)", false));

            ddl.crearTabla(conn, "Persona", columnasPersona);

            ArrayList<Column> columnasDireccion = new ArrayList<>();
            columnasDireccion.add(new Column("id", "INT PRIMARY KEY", true));
            columnasDireccion.add(new Column("idPersona", "INT", true));
            columnasDireccion.add(new Column("direccion", "VARCHAR(100)", true));

            ddl.crearTabla(conn, "Direccion", columnasDireccion);

            // Insertar datos
            Persona persona = new Persona(1, "Juan", "123456789");
            dml.insertarPersona(conn, persona);

            Direccion direccion = new Direccion(1, 1, "Calle Falsa 123");
            dml.insertarDireccion(conn, direccion);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

