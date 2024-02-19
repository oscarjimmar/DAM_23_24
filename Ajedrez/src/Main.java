import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Scanner scan = new Scanner(System.in);
        Tablero tablero = new Tablero();
        int turno = 0;
        boolean turn = false;
        Juego movi = new Juego(turn);
        while (turno<20) {
            if (!turn){
                tablero.pintarTablero();
                System.out.println("Turno Blancas");
                System.out.println("jugada");
                String jugadadw = scan.nextLine();
                if (movi.jugada(jugadadw, tablero) != null) {
                    Posicion inicio = movi.jugada(jugadadw, tablero).getPosInicio();
                    Posicion fin = movi.jugada(jugadadw, tablero).getPosFinal();
                    Pieza aux = tablero.DevolverPieza(inicio);
                    if (aux.validoMovimiento(movi.jugada(jugadadw, tablero))) {
                        if (!tablero.hayPieza(inicio) && !tablero.DevolverPieza(inicio).getColor()) {
                            //if (!tablero.DevolverPieza(inicio).getClass().getSimpleName().equalsIgnoreCase("Peon"))
                            if (!tablero.hayPiezasEntre(movi.jugada(jugadadw, tablero))/*&&!tablero.DevolverPieza(inicio).getClass().getSimpleName().equalsIgnoreCase("Peon")*/) {
                                if (tablero.DevolverPieza(inicio).getClass().getSimpleName().equalsIgnoreCase("Peon")) {
                                    if (tablero.hayPieza(fin) && !movi.jugada(jugadadw, tablero).esDiagonal()) {
                                        tablero.ponPieza(tablero.DevolverPieza(inicio), fin);
                                        tablero.quitaPieza(inicio);
                                        turn=true;
                                    }else if (movi.jugada(jugadadw, tablero).esDiagonal()&& tablero.hayPieza(fin)) {
                                        System.out.println("movimiento no valido");
                                    } else if (tablero.DevolverPieza(inicio).getColor() != tablero.DevolverPieza(fin).getColor() && !tablero.hayPieza(fin) && movi.jugada(jugadadw, tablero).esDiagonal()) {
                                        tablero.quitaPieza(fin);
                                        tablero.ponPieza(tablero.DevolverPieza(inicio), fin);
                                        tablero.quitaPieza(inicio);
                                        turn=true;
                                    } else
                                        System.out.println("movimiento no valido");
                                } else {
                                    if (tablero.hayPieza(fin)) {
                                        tablero.ponPieza(tablero.DevolverPieza(inicio), fin);
                                        tablero.quitaPieza(inicio);
                                        turn=true;
                                    } else if (tablero.DevolverPieza(inicio).getColor() != tablero.DevolverPieza(fin).getColor() && !tablero.DevolverPieza(inicio).getClass().getSimpleName().equalsIgnoreCase("Peon")) {
                                        tablero.quitaPieza(fin);
                                        tablero.ponPieza(tablero.DevolverPieza(inicio), fin);
                                        tablero.quitaPieza(inicio);
                                        turn=true;
                                    } else if (tablero.DevolverPieza(inicio).getColor() != tablero.DevolverPieza(fin).getColor() && !tablero.hayPieza(fin)) {
                                        if (movi.jugada(jugadadw, tablero).esDiagonal()) {
                                            tablero.quitaPieza(fin);
                                            tablero.ponPieza(tablero.DevolverPieza(inicio), fin);
                                            tablero.quitaPieza(inicio);
                                            turn=true;
                                        }
                                    } else
                                        System.out.println("movimiento no valido");
                                }
                            } else
                                System.out.println("movimiento no valido");
                        } else
                            System.out.println("no valido");
                    } else
                        System.out.println("no valido");
                    turno++;
                }
            }else{
                tablero.pintarTablero();
                System.out.println("Turno Negras");
                System.out.println("jugada");
                String jugadadw = scan.nextLine();
                if (movi.jugada(jugadadw, tablero) != null) {
                    Posicion inicio = movi.jugada(jugadadw, tablero).getPosInicio();
                    Posicion fin = movi.jugada(jugadadw, tablero).getPosFinal();
                    Pieza aux = tablero.DevolverPieza(inicio);
                    if (aux.validoMovimiento(movi.jugada(jugadadw, tablero))) {
                        if (!tablero.hayPieza(inicio) && tablero.DevolverPieza(inicio).getColor()) {
                            //if (!tablero.DevolverPieza(inicio).getClass().getSimpleName().equalsIgnoreCase("Peon"))
                            if (!tablero.hayPiezasEntre(movi.jugada(jugadadw, tablero))/*&&!tablero.DevolverPieza(inicio).getClass().getSimpleName().equalsIgnoreCase("Peon")*/) {
                                if (tablero.DevolverPieza(inicio).getClass().getSimpleName().equalsIgnoreCase("Peon")) {
                                    if (tablero.hayPieza(fin) && !movi.jugada(jugadadw, tablero).esDiagonal()) {
                                        tablero.ponPieza(tablero.DevolverPieza(inicio), fin);
                                        tablero.quitaPieza(inicio);
                                        turn=false;
                                    }else if (movi.jugada(jugadadw, tablero).esDiagonal()&& tablero.hayPieza(fin)) {
                                        System.out.println("movimiento no valido");
                                    } else if (tablero.DevolverPieza(inicio).getColor() != tablero.DevolverPieza(fin).getColor() && !tablero.hayPieza(fin) && movi.jugada(jugadadw, tablero).esDiagonal()) {
                                        tablero.quitaPieza(fin);
                                        tablero.ponPieza(tablero.DevolverPieza(inicio), fin);
                                        tablero.quitaPieza(inicio);
                                        turn=false;
                                    } else
                                        System.out.println("movimiento no valido");
                                } else {
                                    if (tablero.hayPieza(fin)) {
                                        tablero.ponPieza(tablero.DevolverPieza(inicio), fin);
                                        tablero.quitaPieza(inicio);
                                        turn=false;
                                    } else if (tablero.DevolverPieza(inicio).getColor() != tablero.DevolverPieza(fin).getColor() && !tablero.DevolverPieza(inicio).getClass().getSimpleName().equalsIgnoreCase("Peon")) {
                                        tablero.quitaPieza(fin);
                                        tablero.ponPieza(tablero.DevolverPieza(inicio), fin);
                                        tablero.quitaPieza(inicio);
                                        turn=false;
                                    } else if (tablero.DevolverPieza(inicio).getColor() != tablero.DevolverPieza(fin).getColor() && !tablero.hayPieza(fin)) {
                                        if (movi.jugada(jugadadw, tablero).esDiagonal()) {
                                            tablero.quitaPieza(fin);
                                            tablero.ponPieza(tablero.DevolverPieza(inicio), fin);
                                            tablero.quitaPieza(inicio);
                                            turn=false;
                                        }
                                    } else
                                        System.out.println("movimiento no valido");
                                }
                            } else
                                System.out.println("movimiento no valido");
                        } else
                            System.out.println("no valido");
                    } else
                        System.out.println("no valido");
                    turno++;
                }
            }
        }
    }
}