import java.util.Random;
import java.util.Scanner;

public class Vaca {
    private String nombre;
    private int edad;
    private float peso;
    private float[]litrosLeche;

    private static final String[] nombres={"NombreV1","NombreV2","NombreV3","NombreV4","NombreV5"};
    public static String getNombreAleatorio(){return nombres[(int) (Math.random()* nombres.length)];}
    public Vaca(){
        nombre=getNombreAleatorio();
        peso= (float) (Math.random()*300+300);
        edad= (int) (Math.random()*25);
        litrosLeche=new float[7];
        for (int i = 0; i < litrosLeche.length; i++) {
            litrosLeche[i]= (float) (Math.random()*50);
        }
    }
    public Vaca(String nombre,int edad,float peso,float[] litrosLeche){
        Scanner scan=new Scanner(System.in);
        this.nombre=nombre;
        this.edad=edad;
        this.peso=peso;
        litrosLeche=new float[7];
        for (int i = 0; i < litrosLeche.length; i++) {
            System.out.println("Cuantos litros dio el dia "+i+1);
            litrosLeche[i]=scan.nextFloat();
        }
    }





    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float[] getLitrosLeche() {
        return litrosLeche;
    }
    public void setLitrosLeche(float[] litrosLeche) {
        this.litrosLeche = litrosLeche;
    }

}
