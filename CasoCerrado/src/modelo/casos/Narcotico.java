package modelo.casos;

import java.util.ArrayList;
import modelo.Bitacora;
import modelo.personas.Detective;
import modelo.personas.Sospechoso;

public class Narcotico extends Caso {

    //Local - Estatal - Federal
    private String tipoCasoNarcotico;

    public Narcotico() {
    }

    public Narcotico(String tipoCasoNarcotico, String clave, String descipcion, String prioridad, Detective detective, Bitacora bitacora, ArrayList sospechosos) {
        super(clave, descipcion, prioridad, detective, bitacora, sospechosos);
        this.tipoCasoNarcotico = tipoCasoNarcotico;
    }

    public String getTipoCasoNarcotico() {
        return tipoCasoNarcotico;
    }

    public int getIdCaso() {
        return idCaso;
    }

    public String getClave() {
        return clave;
    }

    public String getDescipcion() {
        return descipcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public Detective getDetective() {
        return detective;
    }

    public ArrayList<Sospechoso> getSospechosos() {
        return sospechosos;
    }

    public Bitacora getBitacora() {
        return bitacora;
    }

    public void setTipoCasoNarcotico(String tipoCasoNarcotico) {
        this.tipoCasoNarcotico = tipoCasoNarcotico;
    }

    public void setIdCaso(int idCaso) {
        this.idCaso = idCaso;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setDescipcion(String descipcion) {
        this.descipcion = descipcion;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public void setDetective(Detective detective) {
        this.detective = detective;
    }

    public void setSospechosos(ArrayList<Sospechoso> sospechosos) {
        this.sospechosos = sospechosos;
    }

    public void setBitacora(Bitacora bitacora) {
        this.bitacora = bitacora;
    }

    @Override
    public String toString() {
        return "NARCOTICO   » {" + " ID: " + super.idCaso
                + " CLAVE: " + super.clave
                + " DESCRIPCIÓN: " + super.descipcion
                + " PRIRODIAD: " + super.prioridad
                + " DETECTIVE: " + super.detective
                + " BITACORA: " + super.bitacora
                + " SOSPECHOSOS: " + super.sospechosos
                + " TIPO DE CASO: " + tipoCasoNarcotico + '}';
    }

}
