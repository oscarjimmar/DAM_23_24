package Ejercicio2;

import java.util.Objects;
import java.util.Scanner;

public class OperacionesString {
    public static String inicial(String x, String y,String j){
        String str1= String.valueOf(x.charAt(0));
        String str2= String.valueOf(y.charAt(0));
        String str3= String.valueOf(j.charAt(0));
        String fin =str1.concat(str2.concat(str3));
        return fin;
    }
    public static String concatenacion(String x, String y){
        String str1=x.toUpperCase();
        String str2=y.toUpperCase();
        return str1.concat(str2);
    }
    public static void contadorP(){
        Scanner scan=new Scanner(System.in);
        String x=scan.nextLine();
        String [] frase=x.split(" ");
        int cantidad_palabras= frase.length;
        System.out.println("La frase tiene "+cantidad_palabras+" palabras.");
    }
    public static void contadorRepetida(){
        Scanner scan=new Scanner(System.in);
        int repetido=0;
        System.out.println("Introduce una frase.");
        String frase= scan.nextLine();
        System.out.println("Introduce la palabra que  quieres ver cuanto se repite en la frase");
        String introducido=scan.nextLine();
        String [] serie=frase.split(" ");
        for (int i = 0; i < serie.length; i++) {
            if (serie[i].contains(introducido)){
                repetido++;
            }
        }
        System.out.println("La palabra se repite "+repetido+" veces");
    }
}
