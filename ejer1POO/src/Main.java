public class Main {
    public static void main(String[] args) {
        Punto punto =new Punto();
        System.out.println(punto.getX());
        Punto punto1 = new Punto(4, 8);
        System.out.println(punto1.toString());
        Punto puntos[]=new Punto[5];
        for (int i = 0; i < puntos.length; i++) {
            puntos[i] =new Punto();
        }
        for (int i = 0; i < puntos.length; i++) {
            System.out.println(puntos[i]);
        }
        Circulo circulo1 =new Circulo(4,5,7);
        System.out.println(circulo1.toString());
        System.out.println(circulo1.calcularDistanciaDesde(punto1));
    }
}