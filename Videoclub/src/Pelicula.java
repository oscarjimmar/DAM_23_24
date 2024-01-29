public class Pelicula extends DVD {
    private String genero;
    private double precio;

    public Pelicula(){
        super();
    }
    public Pelicula(int id, String titulo, String anioSalida,String genero,double precio) {
        super(id, titulo, anioSalida);
        this.genero=genero;
        this.precio=precio;
    }

    @Override
    public boolean BlueRay() {
        return precio>8;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "genero='" + genero + '\'' +
                ", precio=" + precio +
                '}';
    }
}
