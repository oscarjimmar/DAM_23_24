public abstract class Pieza {
    protected boolean color;
    protected String nombre;
    public abstract boolean validoMovimiento(Movimiento mov);

    public Pieza() {
    }

    public Pieza(boolean color) {
        this.color = color;
        this.nombre=getClass().getSimpleName();
    }

    public boolean getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Pieza{" +
                "color=" + color +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
