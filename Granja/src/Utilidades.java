public class Utilidades {
    public static final String [] nombres={"Paco","Maksim","Quien","Goku","MartyMcfly"};
    public static String getNombreAleatorio(){
        return nombres[(int) (Math.random()* nombres.length)];
    }
}
