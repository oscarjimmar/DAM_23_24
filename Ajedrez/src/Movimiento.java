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
        boolean valido=false;
        if (posInicio.getColumna()==posFinal.getColumna() && posInicio.getFila()!=posFinal.getFila())
            valido=true;
        return valido;
    }
    public boolean esHorizontal(){
        boolean valido=false;
        if (posInicio.getColumna()!=posFinal.getColumna() && posInicio.getFila()==posFinal.getFila())
            valido=true;
        return valido;
    }
    public boolean esDiagonal(){
        return false;
    }
    public int saltoHorizontal(){
        int saltosHorizontal=posInicio.getColumna()-posFinal.getColumna();
        return saltosHorizontal;
    }
    public int saltoVertical(){
        int saltosVertical=posInicio.getFila()-posFinal.getFila();
        return saltosVertical;
    }
}
