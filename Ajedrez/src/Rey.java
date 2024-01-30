public class Rey extends Pieza{
    public Rey(boolean color) {
        super(color);
    }


    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return false;
    }
}
