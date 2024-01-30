public class Torre extends Pieza{

    public Torre(boolean color) {
        super(color);
    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return false;
    }
}
