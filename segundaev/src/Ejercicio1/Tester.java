package Ejercicio1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("1.numero perfecto\n2.piramide");
        int opcion= scan.nextInt();
        switch (opcion){
            case 1:
                System.out.println("introduce un numero");
                int num= scan.nextInt();
                OperacionesVarias.perfecto(num);
                break;
            case 2:
                OperacionesVarias.piramide();
                break;
        }
    }
}
