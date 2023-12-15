package Ejercicio3;

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

    }
}
