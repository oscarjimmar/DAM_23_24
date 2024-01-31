public class Torre extends Pieza{

    public Torre(boolean color) {
        super(color);
    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
        boolean respuesta=false;
        if (mov.esVertical()||mov.esHorizontal())
            respuesta=true;
        return respuesta;
    }
}
