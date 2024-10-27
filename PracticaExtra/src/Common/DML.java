package Common;

import Entities.Persona;
import Entities.Direccion;
import java.sql.*;
import java.util.ArrayList;

public class DML {

    // Consultar 1 persona por id
    public Persona consultarPersonaPorId(Connection conn, int id) throws SQLException {
        String sql = "SELECT * FROM Persona WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                return new Persona(rs.getInt("id"), rs.getString("nombre"), rs.getString("telefono"));
            }
        }
        return null;
    }

    // Insertar persona
    public void insertarPersona(Connection conn, Persona persona) throws SQLException {
        String sql = "INSERT INTO Persona (id, nombre, telefono) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, persona.getId());
            pstmt.setString(2, persona.getNombre());
            pstmt.setString(3, persona.getTelefono());
            pstmt.executeUpdate();
        }
    }

    // Insertar direccion
    public void insertarDireccion(Connection conn, Direccion direccion) throws SQLException {
        String sql = "INSERT INTO Direccion (id, idPersona, direccion) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, direccion.getId());
            pstmt.setInt(2, direccion.getIdPersona());
            pstmt.setString(3, direccion.getDireccion());
            pstmt.executeUpdate();
        }
    }
}

