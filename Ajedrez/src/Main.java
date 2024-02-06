import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Tablero tablero=new Tablero();
        int turno=0;
        boolean turn=true;
        while (turno<20){
            tablero.pintarTablero();
            System.out.println("jugada");
            String jugada=scan.nextLine();
            Juego movi = new Juego(turn);
            movi.jugada(jugada,tablero);

            turno++;
        }
    }
}