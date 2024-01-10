public class Main {
    public static void main(String[] args) {
        Punto punto =new Punto();
        System.out.println(punto.getX());
        Punto punto1=new Punto(5,6);
        System.out.println(punto1.toString());
        Punto puntos[]=new Punto[5];
        for (int i = 0; i < puntos.length; i++) {
            puntos[i] =new Punto();
        }
        for (int i = 0; i < puntos.length; i++) {
            System.out.println(puntos[i]);
        }
    }
}