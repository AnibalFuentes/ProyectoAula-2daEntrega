package modelo;

import java.util.Date;

public class Anotacion {

    private Date fechaRegistro;
    private String observacion;

    public Anotacion() {
    }

    public Anotacion(Date fechaRegistro, String observacion) {
        this.fechaRegistro = fechaRegistro;
        this.observacion = observacion;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public String getObservacion() {
        return this.observacion;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public String toString() {
        return "Anotacion{" + "fechaRegistro=" + fechaRegistro + ", observacion=" + observacion + '}';
    }
}
