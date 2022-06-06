package modelo.casos;

import java.util.ArrayList;
import modelo.Bitacora;
import modelo.personas.Detective;
import modelo.personas.Sospechoso;

public class CiberCrimen extends Caso {

    private String ciberCrimenAsociado;

    public CiberCrimen() {
    }

    public CiberCrimen(String ciberCrimenAsociado, String clave, String descipcion, String prioridad, Detective detective, Bitacora bitacora, ArrayList sospechosos) {
        super(clave, descipcion, prioridad, detective, bitacora, sospechosos);
        this.ciberCrimenAsociado = ciberCrimenAsociado;
    }

    public String getCiberCrimenAsociado() {
        return ciberCrimenAsociado;
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

    public void setCiberCrimenAsociado(String ciberCrimenAsociado) {
        this.ciberCrimenAsociado = ciberCrimenAsociado;
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
        return "CIBERCRIMEN » {" + " ID: " + super.idCaso
                + " CLAVE: " + super.clave
                + " DESCRIPCIÓN: " + super.descipcion
                + " PRIORIDAD: " + super.prioridad
                + " DETECTIVE: " + super.detective
                + " BITACORA: " + super.bitacora
                + " SOSPECHOSOS: " + super.sospechosos
                + " CIBERCRIMEN ASOCIADO: " + ciberCrimenAsociado + '}';
    }

    @Override
    public void crearCasoHomicidio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void crearCasoCibercrimen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void crearCasoNarcotico() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void abrirCaso() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editarCaso() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
