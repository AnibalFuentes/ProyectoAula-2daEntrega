package modelo.personas;

import java.util.ArrayList;
import modelo.casos.Caso;

public class Detective extends Persona {

    private int añosExperiencia;
    private String tipoCaso;
    private ArrayList<Caso> casos = new ArrayList<>();

    public Detective() {
    }

    public Detective(int añosExperiencia, String tipoCaso, String id, String nombre, String apellido) {
        super(id, nombre, apellido);
        this.añosExperiencia = añosExperiencia;
        this.tipoCaso = tipoCaso;
    }

    public int getAñosExperiencia() {
        return this.añosExperiencia;
    }

    public String getTipoCaso() {
        return this.tipoCaso;
    }

    public ArrayList<Caso> getCasos() {
        return this.casos;
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

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public void setTipoCaso(String tipoCaso) {
        this.tipoCaso = tipoCaso;
    }

    public void setCasos(ArrayList<Caso> casos) {
        this.casos = casos;
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
        return "[DETECTIVE » {" + "Id: " + super.id
                + " Nombre: " + super.nombre
                + " Apellido: " + super.apellido
                + " Experiencia: " + añosExperiencia
                + " Tipo de caso: " + tipoCaso
                + " Casos: " + casos + '}';
    }
}
