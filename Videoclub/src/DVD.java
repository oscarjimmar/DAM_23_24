public abstract class DVD {
    protected String titulo;
    protected int anioSalida;



    public DVD(String titulo, int anioSalida) {
        this.titulo = titulo;
        this.anioSalida = anioSalida;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioSalida() {
        return anioSalida;
    }

    public void setAnioSalida(int anioSalida) {
        this.anioSalida = anioSalida;
    }


}
