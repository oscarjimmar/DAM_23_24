public class Pelicula extends DVD {
    private String director;

    public Pelicula(int id, String titulo, int anioSalida) {
        super(id, titulo, anioSalida);
    }

    @Override
    public boolean BlueRay() {
        return false;
    }
}
