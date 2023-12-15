package Ejercicio3;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int opcion=20;
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
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
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
