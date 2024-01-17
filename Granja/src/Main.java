import java.io.IOException;
import java.util.Scanner;

public class Main {
    /*public static Animal creaAnimal(){
        Scanner scan = new Scanner(System.in);
        System.out.println("1.Gallina 2.Vaca 3.Cerdo 4.Oveja");
        int opcion =scan.nextInt();
        Animal aux=null;
        return aux;
    }*/
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String opcion;
        do {
            System.out.println("1.Gallina\n2.Vaca\n3.Cerdo\n4.Oveja\n5.Granja\n6.Salir");
            opcion= scan.nextLine();
            switch (opcion){
                case "1":
                    System.out.println("1.Gallina con datos aleatorios\n2.Gallina introduciendo datos\n3.Salir");
                    String opcion_gallina;
                    do {
                        opcion_gallina=scan.nextLine();
                        switch(opcion_gallina){
                            case "1":
                                Gallina gallinaRandom =new Gallina();
                                System.out.println(gallinaRandom);
                                break;
                            case "2":
                                System.out.println("nombre,edad y peso");
                                String nombre=scan.nextLine();
                                int edad=scan.nextInt();
                                float peso= scan.nextFloat();
                                Gallina gallina1 =new Gallina(nombre,edad,peso);
                                System.out.println(gallina1);
                                break;
                            case "3":
                                System.out.println("saliendo");
                                break;
                            default:
                                System.out.println("Esa opcion no es valida");
                        }
                    }while(!opcion_gallina.equals("3"));
                    break;
                case "2":
                    String opcion_Vaca;
                    do {
                        System.out.println("1.Vaca datos aleatorios\n2.Vaca introduciendo datos\n3.Salir");
                        opcion_Vaca=scan.nextLine();
                        switch (opcion_Vaca){
                            case "1":
                                Vaca vacaRandom =new Vaca();
                                System.out.println(vacaRandom);
                                break;
                            case "2":
                                System.out.println("nombre,edad y peso");
                                String nombre=scan.nextLine();
                                int edad=scan.nextInt();
                                float peso= scan.nextFloat();
                                Vaca vaca1 =new Vaca(nombre,edad,peso);
                                System.out.println(vaca1);
                                break;
                            case "3":
                                System.out.println("saliendo");
                                break;
                            default:
                                System.out.println("Esa opcion no es valida");
                        }
                    }while(!opcion_Vaca.equals("3"));
                    break;
                case "3":
                    String opcion_Cerdo;
                    do {
                        System.out.println("1.Cerdo datos aleatorios\n2.Cerdo introduciendo datos\n3.Salir");
                        opcion_Cerdo=scan.nextLine();
                        switch (opcion_Cerdo){
                            case "1":
                                Cerdo cerdoRandom =new Cerdo();
                                System.out.println(cerdoRandom);
                                break;
                            case "2":
                                System.out.println("nombre,edad y peso");
                                String nombre=scan.nextLine();
                                int edad=scan.nextInt();
                                float peso= scan.nextFloat();
                                Cerdo cerdo1 =new Cerdo(nombre,edad,peso);
                                System.out.println(cerdo1);
                                break;
                            case "3":
                                System.out.println("saliendo");
                                break;
                            default:
                                System.out.println("Esa opcion no es valida");
                        }
                    }while(!opcion_Cerdo.equals("3"));
                    break;
                case "4":
                    String opcion_Oveja;
                    do {
                        System.out.println("1.Oveja datos aleatorios\n2.Oveja introduciendo datos\n3.Salir");
                        opcion_Oveja=scan.nextLine();
                        switch (opcion_Oveja){
                            case "1":
                                Oveja ovejaRandom =new Oveja();
                                System.out.println(ovejaRandom);
                                break;
                            case "2":
                                System.out.println("nombre,edad y peso");
                                String nombre=scan.nextLine();
                                int edad=scan.nextInt();
                                float peso= scan.nextFloat();
                                Oveja oveja1 =new Oveja(nombre,edad,peso);
                                System.out.println(oveja1);
                                break;
                            case "3":
                                System.out.println("saliendo");
                                break;
                            default:
                                System.out.println("Esa opcion no es valida");
                        }
                    }while (!opcion_Oveja.equals("3"));
                    break;
                case "5":
                    Granja granja = new Granja();
                    System.out.println(granja);
                    break;
                case"6":
                    System.out.println("saliendo");
                    break;
                default:
                    System.out.println("opcion no valida");
            }
        }while(!opcion.equals("6"));
    }
}
