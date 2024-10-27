package Common;

import Common.Column;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class DDL {

    public void crearTabla(Connection conn, String nombreTabla, List<Column> columnas) throws SQLException {
        StringBuilder sql = new StringBuilder("CREATE TABLE IF NOT EXISTS " + nombreTabla + " (");
        for (int i = 0; i < columnas.size(); i++) {
            sql.append(columnas.get(i).toString());
            if (i < columnas.size() - 1) {
                sql.append(", ");
            }
        }
        sql.append(");");

        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(sql.toString());
            System.out.println("Tabla " + nombreTabla + " creada correctamente.");
        }
    }

    public void actualizarTabla(Connection conn, String nombreTabla, String alterSQL) throws SQLException {
        String sql = "ALTER TABLE " + nombreTabla + " " + alterSQL;

        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(sql);
            System.out.println("Tabla " + nombreTabla + " actualizada correctamente.");
        }
    }

    public void eliminarTabla(Connection conn, String nombreTabla) throws SQLException {
        String sql = "DROP TABLE IF EXISTS " + nombreTabla;

        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(sql);
            System.out.println("Tabla " + nombreTabla + " eliminada correctamente.");
        }
    }
}

