public class Movimiento {
    private Posicion posInicio;
    private Posicion posFinal;

    /**
     * Constructor vacio de la clase movimiento
     */
    public Movimiento() {
    }

    /**
     * Constructor de la clase movimiento que recive dos parametros la posInicio y posFinal
     * @param posInicio hace referencia a la posicion de la pieza a mover
     * @param posFinal hace referencia a la posicion donde se va a mover la pieza
     */
    public Movimiento(Posicion posInicio, Posicion posFinal) {
        this.posInicio = posInicio;
        this.posFinal = posFinal;
    }

    /**
     * el metodo esVertical se utiliza para saber si la pieza solo se ha movido en vertical
     * @return valido solo devuelve true en caso de que solo cambie la fila
     */
    public boolean esVertical(){
        boolean valido=false;
        if (posInicio.getColumna()==posFinal.getColumna() && posInicio.getFila()!=posFinal.getFila())
            valido=true;
        return valido;
    }
    /**
     * el metodo esHorizontal se utiliza para saber si la pieza solo se ha movido en horizontal
     * @return valido solo devuelve true en caso de que solo cambie la columna
     */
    public boolean esHorizontal(){
        boolean valido=false;
        if (posInicio.getColumna()!=posFinal.getColumna() && posInicio.getFila()==posFinal.getFila())
            valido=true;
        return valido;
    }
    /**
     * el metodo esDiagonal se utilicida para saber si la pieza solo se ha movido en diagonal
     * @return valido solo devuelve true en caso de que
     */
    public boolean esDiagonal(){
        return false;
    }

    /**
     *
     * @return
     */
    public int saltoHorizontal(){
        int saltosHorizontal=posInicio.getColumna()-posFinal.getColumna();
        return saltosHorizontal;
    }
    public int saltoVertical(){
        int saltosVertical=posInicio.getFila()-posFinal.getFila();
        return saltosVertical;
    }
}
