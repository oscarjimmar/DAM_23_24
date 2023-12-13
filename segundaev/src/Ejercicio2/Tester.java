package Ejercicio2;

import java.io.IOException;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
        char opcion=20;
        do {
            System.out.println("1.Iniciales nombre y apellidos\n2.Concatenar dos string\n3.Contar palabras de un String\n4.Cuantas veces aparece String dentro de otro.\n0.Salir");
            opcion = (char) System.in.read();
            System.in.read();
            switch (opcion) {
                case '1':
                    System.out.println("Introduce tu nombre");
                    String nombre= scan.nextLine();
                    System.out.println("Introduce tu primer apellido");
                    String apellido1= scan.nextLine();
                    System.out.println("Introduce tu segundo apellido");
                    String apellido2=scan.nextLine();
                    System.out.println(OperacionesString.inicial(nombre,apellido1,apellido2));
                    break;
                case '2':
                    System.out.println("Introduce una frase");
                    String str1=scan.nextLine();
                    System.out.println("Introduce otra frase");
                    String str2=scan.nextLine();
                    System.out.println(OperacionesString.concatenacion(str1,str2));
                    break;
                case '3':
                    break;
                case '4':
                    System.out.println("Introduce una frase.");
                    String frase= scan.nextLine();
                    System.out.println("Introduce la palabra que  quieres ver cuanto se repite en la frase");
                    String [] serie=frase.split(" ");

                    String repeticion;

                    break;
                default:
                    System.out.println("opcion no valida");
            }
        }while(opcion!='0');
    }
}
