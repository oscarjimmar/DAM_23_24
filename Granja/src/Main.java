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
            System.out.println("1.Gallina\n2.Vaca\n3.Cerdo\n4.Oveja\n5.Salir");
            opcion= scan.nextLine();
            switch (opcion){
                case "1":
                    String opcion_gallina;
                    do {
                        System.out.println("1.Gallina con datos aleatorios\n2.Gallina introduciendo datos\n3.Salir");
                        opcion_gallina=scan.nextLine();
                        switch(opcion_gallina){
                            case "1":
                                Gallina random =new Gallina();
                                break;
                            case "2":
                                System.out.println("nombre,edad y peso");
                                String nombre=scan.nextLine();
                                int edad=scan.nextInt();
                                float peso= scan.nextFloat();
                                Gallina gallina1 =new Gallina(nombre,edad,peso);
                                break;
                            case "3":
                                System.out.println("saliendo");
                                break;
                            default:
                                System.out.println("Esa opcion no es valida");
                        }
                    }while(opcion_gallina!="3");
                    break;
                case "2":
                    String opcion_Vaca;
                    do {
                        System.out.println("1.Vaca datos aleatorios\n2.Gallina introduciendo datos\n3.Salir");
                        opcion_Vaca=scan.nextLine();
                        switch (opcion_Vaca){
                            case "1":
                                Vaca random =new Vaca();
                                break;
                            case "2":
                                System.out.println("nombre,edad y peso");
                                String nombre=scan.nextLine();
                                int edad=scan.nextInt();
                                float peso= scan.nextFloat();
                                Vaca vaca1 =new Vaca(nombre,edad,peso);
                                break;
                            case "3":
                                System.out.println("saliendo");
                                break;
                            default:
                                System.out.println("Esa opcion no es valida");
                        }
                    }while(opcion_Vaca!="3");
                    break;
                case "3":
                    String opcion_Cerdo;
                    do {
                        System.out.println("1.Vaca datos aleatorios\n2.Gallina introduciendo datos\n3.Salir");
                        opcion_Cerdo=scan.nextLine();
                        switch (opcion_Cerdo){
                            case "1":
                                Cerdo random =new Cerdo();
                                break;
                            case "2":
                                System.out.println("nombre,edad y peso");
                                String nombre=scan.nextLine();
                                int edad=scan.nextInt();
                                float peso= scan.nextFloat();
                                Cerdo vaca1 =new Cerdo(nombre,edad,peso);
                                break;
                            case "3":
                                System.out.println("saliendo");
                                break;
                            default:
                                System.out.println("Esa opcion no es valida");
                        }
                    }while(opcion_Cerdo!="3");
                    break;
                case "4":
                    break;
                case "5":
                    break;
                default:
                    System.out.println("opcion no valida");
            }
        }while(opcion!="5");
    }
    /*
    System.out.println("nombre,edad y peso");
                    String nombre= scan.nextLine();
                    int edad= scan.nextInt();
                    float peso= scan.nextFloat();
                    Gallina gallina1=new Gallina(nombre,edad,peso);
                    System.out.println(gallina1.toString());
                    Gallina random=new Gallina();
                    System.out.println(random);
     */
}
