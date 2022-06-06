package modelo;

import java.util.ArrayList;

public class Bitacora {

    private ArrayList<Anotacion> anotaciones = new ArrayList<>();

    public Bitacora() {
    }

    public Bitacora(ArrayList anotaciones) {
        this.anotaciones = anotaciones;
    }

    public ArrayList<Anotacion> getAnotaciones() {
        return this.anotaciones;
    }

    public void setAnotaciones(ArrayList<Anotacion> anotaciones) {
        this.anotaciones = anotaciones;
    }

    @Override
    public String toString() {
        return "Bitacora{" + "anotaciones=" + anotaciones + '}';
    }
}
