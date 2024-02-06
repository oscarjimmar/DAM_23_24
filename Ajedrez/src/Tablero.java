public class Tablero {
    Pieza [][] tablero = new Pieza[8][8];

    /**
     * constructor de la clase tablero
     */
    public Tablero(){
        tablero[0][0]=new Torre(true);
        tablero[0][7]=new Torre(false);
    }

    /**
     * metodo que pinta el tablero identificando la casilla y colocando el nombre de la pieza que este en ella
     */
    public void pintarTablero(){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (tablero[i][j]!=null)
                    System.out.print(tablero[i][j].getClass().getSimpleName()+" ");
                else
                    System.out.print("*** ");
            }
            System.out.println();
        }
    }

    /**
     * metodo que comprueba si hay alguna pieza en la posicion dada
     * @param columna hace referencia a la columna
     * @param fila hace referencia a la fila
     * @return si es true devolvera que la casilla esta vacia y si es false es que hay una pieza
     */
    public boolean hayPieza(int columna,int fila){
        if (tablero[columna][fila]==null)
            return true;
        else
            return false;
    }

    /**
     * metodo que comprueba si hay alguna pieza en la posicion dada
     * @param pos recoge la posicion dada
     * @return si es true devolvera que la casilla esta vacia y si es false es que hay una pieza
     */
    public boolean hayPieza(Posicion pos){
        boolean vacio=false;
        if (tablero[pos.getFila()][pos.getColumna()]==null)
            vacio=true;

        return vacio;
    }

    /**
     * comprueva si hay piezas entre la posicion de la pieza y a la que se va a mover
     * @param mov recoje el movimiento para comprobar si se encuentra alguna pieza
     * @return si es true devolvera que hay una pieza entre medias si es false devolvera que no hay piezas entre medias
     */
    public boolean hayPiezasEntre(Movimiento mov){
        boolean vacio=false;
        if (mov.esHorizontal()){
        }else if (mov.esVertical()){

        }else

        return false;
        return vacio;
    }

    /**
     * metodo que coloca la pieza en la posicion dada
     * @param figura hace referencia a una pieza del tablero
     * @param columna hace referencia a la columna a la que se colocara la pieza
     * @param fila hace referencia a la fila a la que se colocara la pieza
     */
    public void ponPieza (Pieza figura,int columna,int fila){
        if (!hayPieza(columna, fila))
            tablero[columna][fila]=figura;
    }

    /**
     * metodo que coloca la pieza en la posicion dada
     * @param figura hace referencia a una pieza del tablero
     * @param pos hace referencia a la posicion a la que ira la pieza
     */
    public void ponPieza (Pieza figura,Posicion pos){
        if (!hayPieza(pos))
            tablero[pos.getColumna()][pos.getFila()]=figura;
    }

    /**
     * metodo que elimina una pieza de una casilla
     * @param columna hace referencia a la columna de la que se eliminara la pieza
     * @param fila hace referencia a la fila de la que se eliminara la pieza
     */
    public void quitaPieza(int columna,int fila){
        if (hayPieza(columna,fila))
            tablero[columna][fila]=null;
    }

    /**
     * metodo que elimina una pieza de una casilla
     * @param pos hace referencia a la casilla de la que se eliminara la pieza
     */
    public void quitaPieza(Posicion pos){
        if (hayPieza(pos))
            tablero[pos.getColumna()][pos.getFila()]=null;
    }

    /**
     * metodo que devuelve la pieza que se encuentra en una casilla
     * @param columna hace referencia a la columna en la que se encuentra la pieza
     * @param fila hace referencia a la fila en la que se encuentra la pieza
     * @return devuelve la pieza que se encuentra en esa casilla
     */
    public Pieza devolverPieza (int columna,int fila){
        return tablero[columna][fila];
    }

    /**
     * metodo que devuelve la pieza que se encuentra en una casilla
     * @param pos hace referencia a la casilla en la que se encuentra la pieza
     * @return devuelve la pieza que se encuentra en esa casilla
     */
    public Pieza DevolverPieza(Posicion pos){
        return tablero[pos.getColumna()][pos.getFila()];
    }
}
