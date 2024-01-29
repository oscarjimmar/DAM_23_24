public abstract class DVD {
    protected int id;
    protected String titulo;
    protected String anioSalida;


    public DVD(){}
    public DVD(int id, String titulo, String anioSalida) {
        this.id=id;
        this.titulo = titulo;
        this.anioSalida = anioSalida;
    }
    public abstract boolean BlueRay();
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnioSalida() {
        return anioSalida;
    }

    public void setAnioSalida(String anioSalida) {
        this.anioSalida = anioSalida;
    }


}
