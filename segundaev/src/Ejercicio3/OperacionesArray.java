package Ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class OperacionesArray {
    public static int[] Cargararray(int[] x){
        for (int i = 0; i <x.length ; i++) {
            x[i]= (int) Math.floor(Math.random()*10+1);
        }
        return x;
    }
    public static int[] MostrarArray(int[] x){
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] +" ");
        }
        System.out.println();
        return x;
    }
    public static int[] OrdenarArray(int[] x){
        Arrays.sort(x);
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] +" ");
        }
        System.out.println();
        return x;
    }
    public static int Media(int[] x){
        int total=0;
        for (int i = 0; i < x.length; i++) {
            total=total+x[i];
        }
        return total/x.length;
    }
    public static int[] InvertirArray(int[] x){

        for(int i=x.length-1;i>=0;i--) {
            System.out.print(x[i] + "  ");
        }
        System.out.println();
        return x;
    }
    public static boolean ComprobarNum(int[] x){
        boolean y = false;
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduce un numero para comprobar si esta");
        int num =scan.nextInt();
        for (int i = 0; i < x.length && y==false; i++) {
            if (num==x[i])
                y=true;
        }
        return y;
    }
}
