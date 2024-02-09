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
                if (!tablero.hayPieza(movi.jugada(jugadadw, tablero).getPosInicio())) {
                    if (tablero.hayPieza(movi.jugada(jugadadw, tablero).getPosFinal())) {
                        tablero.ponPieza(tablero.DevolverPieza(movi.jugada(jugadadw, tablero).getPosInicio()), movi.jugada(jugadadw, tablero).getPosFinal());
                        tablero.quitaPieza(movi.jugada(jugadadw, tablero).getPosInicio());
                    }
                } else
                    System.out.println("movimiento no valido");
            } else
                System.out.println("no valido");
            turno++;
        }
    }
}