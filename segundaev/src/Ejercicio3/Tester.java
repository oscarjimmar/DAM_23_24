package Ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int opcion=20;
        boolean comprobar = false;
        int serie[]=new int[10];
        do {
            System.out.println("1.Cargar Array\n2.Mostrar Array\n3.Ordenar Array\n4.Calcular media\n5.Array invertido\n6.Comprobar si se encuentra el numero\n0.Salir");
            opcion = scan.nextInt();
            switch (opcion){
                case 1:
                    OperacionesArray.Cargararray(serie);
                    break;
                case 2:
                    OperacionesArray.MostrarArray(serie);
                    break;
                case 3:
                    OperacionesArray.OrdenarArray(serie);
                    break;
                case 4:
                    System.out.println(OperacionesArray.Media(serie));
                    break;
                case 5:
                    break;
                case 6:
                    OperacionesArray.ComprobarNum(serie,comprobar);
                    if (comprobar==true)
                        System.out.println("El número está");
                    else
                        System.out.println("El número no está");
                    break;
                case 0:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while(opcion!=0);
    }
}
