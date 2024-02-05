public class Juego {

    private boolean turno;

    public Juego(boolean turno) {
        turno = turno;
    }

    public boolean getTurno() {
        return turno;
    }

    public void setTurno(int turno){
    }
    public  Movimiento jugada(String jugada,Tablero tablero){
        if (jugada.length()==4) {
        int col1 = jugada.toUpperCase().charAt(0) - 65;
        int fil1 = jugada.charAt(1) - 49;
        int col2 = jugada.toUpperCase().charAt(2) - 65;
        int fil2 = jugada.charAt(1) - 49;
        if ((col1 >= 0 && col1 <= 8 && fil1 >= 0 && fil1 <= 8) && (col2 >= 0 && col2 <= 8 && fil2 >= 0 && fil2 <= 8)) {
            if (tablero.hayPieza(col2, fil2)) {
                return new Movimiento(new Posicion(col1, fil1), new Posicion(col2, fil2));
            }
        }
        }
        return new Movimiento();
    }
}
