public class Caballo extends Pieza{
    public Caballo(boolean color) {
        super(color);
    }

    @Override
    public String getUnicode() {
        return color ? "\u2658" : "\u265E";
    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return false;
    }
}
