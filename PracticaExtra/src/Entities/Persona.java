package Entities;

import java.util.ArrayList;

public class Persona {
    private int id;
    private String nombre;
    private String telefono;
    private ArrayList<Direccion> direcciones;

    public Persona(int id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direcciones = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public ArrayList<Direccion> getDirecciones() {
        return direcciones;
    }

    public void addDireccion(Direccion direccion) {
        this.direcciones.add(direccion);
    }
}

