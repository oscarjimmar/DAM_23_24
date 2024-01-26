public class CentroSalud {
    private int identificador;
    private String nombre;
    private String domicilio;
    private String codigo_postal;

    public CentroSalud(){

    }
    public CentroSalud(int identificador, String nombre, String domicilio, String codigo_postal) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.codigo_postal = codigo_postal;
    }

    @Override
    public String toString() {
        return "CentroSalud{" +
                "identificador=" + identificador +
                ", nombre='" + nombre + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", codigo_postal='" + codigo_postal + '\'' +
                '}';
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }
}
