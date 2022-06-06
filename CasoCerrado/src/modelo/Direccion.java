package modelo;

public class Direccion {

    private String noVivivenda;
    private String localidad;
    private String ciudad;
    private String departamento;
    private String pais;
    private String descripcion;
    private boolean fotografia;

    public Direccion() {
    }

    public Direccion(String noVivivenda, String localidad, String ciudad, String departamento, String pais, String descripcion, boolean fotografia) {
        this.noVivivenda = noVivivenda;
        this.localidad = localidad;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.pais = pais;
        this.descripcion = descripcion;
        this.fotografia = fotografia;
    }

    public String getNoVivivenda() {
        return this.noVivivenda;
    }

    public String getLocalidad() {
        return this.localidad;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public String getPais() {
        return this.pais;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public boolean isFotografia() {
        return this.fotografia;
    }

    public void setNoVivivenda(String noVivivenda) {
        this.noVivivenda = noVivivenda;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFotografia(boolean fotografia) {
        this.fotografia = fotografia;
    }

    @Override
    public String toString() {
        return "Direccion{" + "noVivivenda: " + noVivivenda + " localidad: " + localidad + " ciudad: " + ciudad + " departamento: " + departamento + " pais: " + pais + " descripcion: " + descripcion + " fotografia: " + fotografia + '}';
    }
}
