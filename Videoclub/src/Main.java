import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tamaño de inventario");
        int tam=scanner.nextInt();
        Tienda tienda = new Tienda(tam);

        //tienda.darDeAltaDVD();
        //tienda.darDeAltaDVD();

        // Menú de opciones


        while (true) {
            System.out.println("\n*** Menú de la Tienda ***");
            System.out.println("1. Listar DVDs");
            System.out.println("2. Dar de alta un DVD");
            System.out.println("3. Eliminar un DVD");
            System.out.println("4. Listar DVDs por fecha");
            System.out.println("5. Modificar atributo de un DVD");
            System.out.println("6. Mostrar número de DVDs Blu-ray");
            System.out.println("0. Salir");

            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    tienda.listarDVDs();
                    break;
                case 2:
                    tienda.darDeAltaDVD();
                    break;
                case 3:
                    System.out.print("Ingrese el ID del DVD a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    tienda.eliminarDVD(idEliminar);
                    break;
                case 4:
                    System.out.print("Ingrese la fecha de referencia: ");
                    String fechaReferencia = scanner.nextLine();
                    tienda.listarDVDsPorFecha(fechaReferencia);
                    break;
                case 5:
                    System.out.print("Ingrese el ID del DVD a modificar: ");
                    int idModificar = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea

                    System.out.println("Que atributo desea cambiar?");
                    String nuevoAtributo = scanner.nextLine();

                    System.out.print("Ingrese el nuevo dato: ");
                    String nuevoDato = scanner.nextLine();

                    tienda.modificarAtributoDVD(idModificar, nuevoAtributo);
                    break;
                case 6:
                    tienda.mostrarNumeroDVDsBluRay();
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}