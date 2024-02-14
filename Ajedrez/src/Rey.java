public class Rey extends Pieza {
    public Rey(boolean color) {
        super(color);
        /*if (color) {
            String unicodeMessage = "\u265A";
            PrintStream out = new PrintStream(System.out, true, "UTF8");
            out.println(unicodeMessage);
        }*/
    }

    @Override
    public String getUnicode() {
        return color ? "\u2654" : "\u265A";
    }


    @Override
    public boolean validoMovimiento(Movimiento mov) {
        boolean respuesta = false;
        if (mov.esVertical() || mov.esHorizontal() || mov.esDiagonal())
            if (Math.abs(mov.saltoHorizontal()) == 1 || Math.abs(mov.saltoVertical()) == 1 ) {
                respuesta = true;
            }
        return respuesta;
    }
}