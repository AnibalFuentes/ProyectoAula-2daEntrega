package modelo.personas;

public abstract class Persona {

    protected String id;
    protected String nombre;
    protected String apellido;

    public Persona() {
    }

    public Persona(String id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
}
