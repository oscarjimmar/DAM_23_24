public class Tablero {
    Pieza [][] tablero = new Pieza[8][8];
    public Tablero(){
        tablero[0][0]=new Torre(true);
        tablero[0][7]=new Torre(false);
    }
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
    public boolean hayPieza(int columna,int fila){
        if (tablero[columna][fila]==null)
            return true;
        else
            return false;
    }
    public boolean hayPieza(Posicion pos){
        boolean vacio=false;
        if (tablero[pos.getFila()][pos.getColumna()]==null)
            vacio=true;

        return vacio;
    }
}
