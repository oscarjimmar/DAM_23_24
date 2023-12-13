package Ejercicio1;

import java.util.Scanner;

public class OperacionesVarias {
    public static void perfecto(int x){
        int total=0;
        for (int i = 1; i < x; i++) {
            if(x%i==0){
                total=total+i;
            }
        }
        if (total==x){
            System.out.println("el numero es perfecto");
        }else
            System.out.println("el numero no es perfecto");
    }
    public static void piramide(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduce el tamaño");
        int tama = scan.nextInt();
        for (int i = 0; i <tama ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
