import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
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
                Posicion inicio = movi.jugada(jugadadw, tablero).getPosInicio();
                Posicion fin = movi.jugada(jugadadw, tablero).getPosFinal();
                Pieza aux = tablero.DevolverPieza(inicio);
                if (aux.validoMovimiento(movi.jugada(jugadadw, tablero))) {
                    if (!tablero.hayPieza(inicio)) {
                        //if (!tablero.DevolverPieza(inicio).getClass().getSimpleName().equalsIgnoreCase("Peon"))
                            if (!tablero.hayPiezasEntre(movi.jugada(jugadadw, tablero))/*&&!tablero.DevolverPieza(inicio).getClass().getSimpleName().equalsIgnoreCase("Peon")*/) {
                                if (tablero.hayPieza(fin)) {
                                    tablero.ponPieza(tablero.DevolverPieza(inicio), fin);
                                    tablero.quitaPieza(inicio);
                                } else if (tablero.DevolverPieza(inicio).getColor() != tablero.DevolverPieza(fin).getColor()) {
                                    tablero.quitaPieza(fin);
                                    tablero.ponPieza(tablero.DevolverPieza(inicio), fin);
                                    tablero.quitaPieza(inicio);
                                } else
                                    System.out.println("movimiento no valido");
                            }
                    } else
                        System.out.println("movimiento no valido");
                } else
                    System.out.println("jugada no valida");
            } else
                System.out.println("no valido");
            turno++;
        }
    }
}