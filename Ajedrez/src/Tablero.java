import java.io.UnsupportedEncodingException;

public class Tablero {
    Pieza[][] tablero = new Pieza[8][8];

    /**
     * constructor de la clase tablero
     */
    public Tablero() throws UnsupportedEncodingException {
        //piezas negras
        tablero[0][0] = new Torre(true);
        tablero[0][1] = new Caballo(true);
        tablero[0][2] = new Alfil(true);
        tablero[0][3] = new Dama(true);
        tablero[0][4] = new Rey(true);
        tablero[0][5] = new Alfil(true);
        tablero[0][6] = new Caballo(true);
        tablero[0][7] = new Torre(true);
        //piezas blancas
        tablero[7][0] = new Torre(false);
        tablero[7][1] = new Caballo(false);
        tablero[7][2] = new Alfil(false);
        tablero[7][3] = new Dama(false);
        tablero[7][4] = new Rey(false);
        tablero[7][5] = new Alfil(false);
        tablero[7][6] = new Caballo(false);
        tablero[7][7] = new Torre(false);
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (i == 1)
                    tablero[i][j]=new Peon(true);
                else if (i == 6)
                    tablero[i][j]=new Peon(false);
            }
        }

    }

    /**
     * metodo que pinta el tablero identificando la casilla y colocando el nombre de la pieza que este en ella
     */
    public void pintarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (tablero[i][j] != null)
                    System.out.print(tablero[i][j].getUnicode() + " ");
                else
                    System.out.print("\u29c9" + " ");
            }
            System.out.println();
        }
    }

    /**
     * metodo que comprueba si hay alguna pieza en la posicion dada
     *
     * @param columna hace referencia a la columna
     * @param fila    hace referencia a la fila
     * @return si es true devolvera que la casilla esta vacia y si es false es que hay una pieza
     */
    public boolean hayPieza(int columna, int fila) {
        if (tablero[columna][fila] == null)
            return true;
        else
            return false;
    }

    /**
     * metodo que comprueba si hay alguna pieza en la posicion dada
     *
     * @param pos recoge la posicion dada
     * @return si es true devolvera que la casilla esta vacia y si es false es que hay una pieza
     */
    public boolean hayPieza(Posicion pos) {
        boolean vacio = false;
        if (tablero[pos.getColumna()][pos.getFila()] == null)
            vacio = true;
        return vacio;
    }
    public Pieza hayPromocion(Movimiento mov){
        boolean promocion=false;
        if (mov.getPosFinal().equals(tablero[mov.getPosFinal().getColumna()][0]) ){
            Posicion pos=new Posicion(0,mov.getPosFinal().getColumna());
        }
        return new p;
    }

    /**
     * comprueva si hay piezas entre la posicion de la pieza y a la que se va a mover
     *
     * @param mov recoje el movimiento para comprobar si se encuentra alguna pieza
     * @return si es true devolvera que hay una pieza entre medias si es false devolvera que no hay piezas entre medias
     */
    public boolean hayPiezasEntre(Movimiento mov) {
        boolean piezaEntre = false;
        if (mov.esVertical()) {
            if (mov.getPosInicio().getFila() < mov.getPosFinal().getFila()) {
                for (int i = mov.getPosInicio().getFila() + 1; i < mov.getPosFinal().getFila() && !piezaEntre; i++) {
                    if (!hayPieza(mov.getPosInicio().getColumna(), i)) {
                        piezaEntre = true;
                    }
                }
            } else {
                for (int i = mov.getPosInicio().getFila() - 1; i > mov.getPosFinal().getFila() && !piezaEntre; i--) {
                    if (!hayPieza(mov.getPosInicio().getColumna(), i)) {
                        piezaEntre = true;
                    }
                }
            }
        } else if (mov.esHorizontal()) {
            if (mov.getPosInicio().getColumna() < mov.getPosFinal().getColumna()) {
                for (int i = mov.getPosInicio().getColumna() + 1; i < mov.getPosFinal().getColumna() && !piezaEntre; i++) {
                    if (!hayPieza(i, mov.getPosInicio().getFila())) {
                        piezaEntre = true;
                    }
                }
            } else {
                for (int i = mov.getPosInicio().getColumna() - 1; i > mov.getPosFinal().getColumna() && !piezaEntre; i--) {
                    if (!hayPieza(i, mov.getPosInicio().getFila())) {
                        piezaEntre = true;
                    }
                }
            }
        }
        return piezaEntre;
    }
    /*public boolean comerPeon(Movimiento movv,Tablero tablero){
        boolean comer=false;
        if (tablero.)
    }*/

    /**
     * metodo que coloca la pieza en la posicion dada
     *
     * @param figura  hace referencia a una pieza del tablero
     * @param columna hace referencia a la columna a la que se colocara la pieza
     * @param fila    hace referencia a la fila a la que se colocara la pieza
     */
    public void ponPieza(Pieza figura, int columna, int fila) {
        if (hayPieza(columna, fila))
            tablero[columna][fila] = figura;
    }

    /**
     * metodo que coloca la pieza en la posicion dada
     *
     * @param figura hace referencia a una pieza del tablero
     * @param pos    hace referencia a la posicion a la que ira la pieza
     */
    public void ponPieza(Pieza figura, Posicion pos) {
        if (hayPieza(pos)) {
            tablero[pos.getColumna()][pos.getFila()] = figura;
        }
    }

    /**
     * metodo que elimina una pieza de una casilla
     *
     * @param columna hace referencia a la columna de la que se eliminara la pieza
     * @param fila    hace referencia a la fila de la que se eliminara la pieza
     */
    public void quitaPieza(int columna, int fila) {
        if (!hayPieza(columna, fila))
            tablero[columna][fila] = null;
    }

    /**
     * metodo que elimina una pieza de una casilla
     *
     * @param pos hace referencia a la casilla de la que se eliminara la pieza
     */
    public void quitaPieza(Posicion pos) {
        if (!hayPieza(pos))
            tablero[pos.getColumna()][pos.getFila()] = null;
    }

    /**
     * metodo que devuelve la pieza que se encuentra en una casilla
     *
     * @param columna hace referencia a la columna en la que se encuentra la pieza
     * @param fila    hace referencia a la fila en la que se encuentra la pieza
     * @return devuelve la pieza que se encuentra en esa casilla
     */
    public Pieza devolverPieza(int columna, int fila) {
        return tablero[columna][fila];
    }

    /**
     * metodo que devuelve la pieza que se encuentra en una casilla
     *
     * @param pos hace referencia a la casilla en la que se encuentra la pieza
     * @return devuelve la pieza que se encuentra en esa casilla
     */
    public Pieza DevolverPieza(Posicion pos) {
        return tablero[pos.getColumna()][pos.getFila()];
    }


}
