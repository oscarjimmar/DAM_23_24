package Ejercicio2;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int opcion=20;
        do {
            System.out.println("1.Iniciales nombre y apellidos\n2.Concatenar dos string\n3.Contar palabras de un String\n4.Cuantas veces aparece String dentro de otro.\n0.Salir");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }while(opcion!=0);
    }
}
