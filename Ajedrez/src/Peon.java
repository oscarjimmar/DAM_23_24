public class Peon extends Pieza{
    boolean primerMov=true;
    public Peon(boolean color) {
        super(color);
    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
        boolean valido=false;
        if (color){
            if (mov.esVertical() || mov.esDiagonal())
                if (primerMov){
                    if (mov.saltoVertical() == 1 || mov.saltoVertical() == 2) {
                        valido=true;
                    }
                }else {

                }
        }
        return valido;
    }

    @Override
    public String getUnicode() {
        return color? "\u2659" : "\u265F";
    }

}
