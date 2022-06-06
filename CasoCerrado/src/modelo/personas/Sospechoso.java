package modelo.personas;

import modelo.Direccion;

public class Sospechoso extends Persona {

    private String alias;
    private int edad;
    private Direccion direccion;

    public Sospechoso() {
    }

    public Sospechoso(String alias, int edad, Direccion direccion, String id, String nombre, String apellido) {
        super(id, nombre, apellido);
        this.alias = alias;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getAlias() {
        return this.alias;
    }

    public int getEdad() {
        return this.edad;
    }

    public Direccion getDireccion() {
        return this.direccion;
    }

    public String getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "SOSPECHOSO » {" + "Id: " + super.id
                + " Nombre: " + super.nombre
                + " Apellido: " + super.apellido
                + " alias: " + alias
                + " edad: " + edad
                + " direccion: " + direccion + '}';
    }
}
