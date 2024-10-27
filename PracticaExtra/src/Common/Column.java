package Common;

public class Column {
    private String nombre;
    private String tipo;
    private boolean isNotNull;

    public Column(String nombre, String tipo, boolean isNotNull) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.isNotNull = isNotNull;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isNotNull() {
        return isNotNull;
    }

    @Override
    public String toString() {
        return nombre + " " + tipo + (isNotNull ? " NOT NULL" : "");
    }
}

