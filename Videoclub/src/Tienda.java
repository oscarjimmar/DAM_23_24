import java.util.Scanner;

public class Tienda {
    private DVD[] inventario;

    public Tienda() {

        inventario = new DVD[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < inventario.length; i++) {
            System.out.println("Ingrese los datos para el DVD en la posición " + i + ":");

            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Año de salida: ");
            String fechaSalida = scanner.nextLine();

            System.out.print("Precio: ");
            double precio=scanner.nextDouble();
            scanner.nextLine();

            if (i % 2 == 0) {
                System.out.print("Ingrese el género de la película: ");
                String genero = scanner.nextLine();
                Pelicula nuevoDVD = new Pelicula(id, nombre, fechaSalida, genero, precio);
            } else {
                System.out.print("Ingrese la plataforma del videojuego: ");
                String plataforma = scanner.nextLine();
                Videojuego nuevoDVD = new Videojuego(id, nombre, fechaSalida, plataforma, precio);
            }
        }
    }

    public void listarDVDs() {
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i]!=null)
                System.out.println(inventario[i].toString());
        }
    }

    public void darDeAltaDVD() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("es una pelicula o un videojuego");
        String tipoDvd=scanner.nextLine();

        System.out.print("Ingrese el ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la fecha de salida: ");
        String fechaSalida = scanner.nextLine();

        System.out.println("Introduzca el precio");
        double precio=scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Ingrese el género (para película) o la plataforma (para videojuego): ");
        String tipo = scanner.nextLine();

        System.out.println("En que posicion desea introducirlo");
        int posArray=scanner.nextInt();

        for (int i = 0; i < inventario.length; i++) {
            if (inventario.length==posArray){
                if (tipoDvd.equalsIgnoreCase("pelicula")){
                    inventario[i]=new Pelicula(id,nombre,fechaSalida,tipo,precio);
                }else {
                    inventario[i]=new Videojuego(id,nombre,fechaSalida,tipo,precio);
                }
            }
        }
    }

    public void eliminarDVD(int idEliminar) {
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i].getId() == idEliminar) {
                inventario[i] = null;
                break;
            }
        }
    }

    public void listarDVDsPorFecha(String fechaReferencia) {
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] != null && inventario[i].getAnioSalida().compareTo(fechaReferencia) > 0) {
                System.out.println(inventario[i].toString());
            }
        }
    }

    public void modificarAtributoDVD(int idModificar, String nuevoAtributo) {
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] != null && inventario[i].getId() == idModificar){

            }
        }
    }

    public void mostrarNumeroDVDsBluRay() {
        int peliculasBluRay = 0;
        int videojuegosBluRay = 0;

        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] != null && inventario[i].BlueRay()) {
                if (inventario[i] instanceof Pelicula) {
                    peliculasBluRay++;
                } else if (inventario[i] instanceof Videojuego) {
                    videojuegosBluRay++;
                }
            }
        }

        System.out.println("Número de películas Blu-ray: " + peliculasBluRay);
        System.out.println("Número de videojuegos Blu-ray: " + videojuegosBluRay);
    }
}

