public class Videojuego extends DVD{
    private String plataforma;
    private double precio;

    public Videojuego(int id, String nombre, String anioSalida, String plataforma,double precio) {
        super(id, nombre, anioSalida);
        this.plataforma = plataforma;
        this.precio=precio;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public boolean BlueRay() {
        return plataforma.equalsIgnoreCase("PS5")||precio>30;
    }
}

