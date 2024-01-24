public class Utilidades {
    public static final String [] titulo={"Spider-man","Maksim","Quien","Goku","MartyMcfly"};
    public static String getTituloAleatorio(){
        return titulo[(int) (Math.random()* titulo.length)];
    }
}