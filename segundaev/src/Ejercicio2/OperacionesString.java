package Ejercicio2;

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
}
