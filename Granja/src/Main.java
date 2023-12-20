import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String opcion;
        do {
            System.out.println("1.Gallina\n2.Vaca\n3.Cerdo\n4.Oveja\n5.Salir");
            opcion= scan.nextLine();

            switch (opcion){
                case "1":
                    String opcion_gallina;
                    do {
                        System.out.println("1.Gallina datos aleatorios\n2.Gallina introduciendo datos\n3.Salir");
                        opcion_gallina=scan.nextLine();
                        switch(opcion_gallina){
                            case "1":
                                break;
                            case "2":
                                break;
                            case "3":
                                break;
                            default:
                                System.out.println("no es valida");

                        }
                    }while(opcion_gallina!="3");
                    System.out.println("nombre,edad y peso");
                    String nombre= scan.nextLine();
                    int edad= scan.nextInt();
                    float peso= scan.nextFloat();
                    Gallina random =new Gallina();
                    Gallina gallina1=new Gallina(nombre,edad,peso);
                    System.out.println(gallina1.toString());
                    System.out.println(random.toString());
                    break;

            }
        }while(opcion!="5");
    }
}