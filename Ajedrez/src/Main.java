import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Tablero tablero = new Tablero();
        int turno = 0;
        boolean turn = true;
        Juego movi = new Juego(turn);
        while (turno < 20) {
            tablero.pintarTablero();
            System.out.println("jugada");
            String jugadadw = scan.nextLine();
            if (movi.jugada(jugadadw, tablero) != null) {
                Posicion inicio = movi.jugada(jugadadw,tablero).getPosInicio();
                Posicion fin = movi.jugada(jugadadw,tablero).getPosFinal();
                if (!tablero.hayPieza(inicio)) {
                    if (tablero.hayPieza(fin)){
                        tablero.ponPieza(tablero.DevolverPieza(inicio), fin);
                        tablero.quitaPieza(inicio);
                    }else if (tablero.DevolverPieza(inicio).getColor()!= tablero.DevolverPieza(fin).getColor()) {
                        tablero.quitaPieza(fin);
                        tablero.ponPieza(tablero.DevolverPieza(inicio), fin);
                        tablero.quitaPieza(inicio);
                        }else
                        System.out.println("movimiento no valido");
                } else
                    System.out.println("movimiento no valido");
            } else
                System.out.println("no valido");
            turno++;
        }
    }
}