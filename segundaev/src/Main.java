import java.util.Scanner;

public class Main {
    public static int suma (int x, int y){
        int resultado =x+y;
        return resultado;
    }
    public static void resta (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca operandos");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        System.out.println(num1-num2);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.sumar\n 2.restar\n 3.multiplicar\n 4.dividir");
        int opcion =scan.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Introduzca operandos");
                int num1=scan.nextInt();
                int num2=scan.nextInt();
                System.out.println(suma(num1,num2));
                break;
            case 2:
                resta();
                break;
        }
    }
}