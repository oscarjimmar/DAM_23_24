public class Movimiento {
    private Posicion posInicio;
    private Posicion posFinal;

    public Movimiento() {
    }

    public Movimiento(Posicion posInicio, Posicion posFinal) {
        this.posInicio = posInicio;
        this.posFinal = posFinal;
    }
    public boolean esVertical(){
        return false;
    }
    public boolean esHorizontal(){
        return false;
    }
    public boolean esDiagonal(){
        return false;
    }
    public int saltoHorizontal(){
        return 0;
    }
    public int saltoVertical(){
        return 0;
    }
}
