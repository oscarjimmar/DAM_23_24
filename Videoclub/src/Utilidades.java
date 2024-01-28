public class Utilidades {
    public static final String [] titulo={"Spider-man","Good guys","Batman","Vengadores","Kingsman"};
    public static String getTituloAleatorio(){
        return titulo[(int) (Math.random()* titulo.length)];
    }
}