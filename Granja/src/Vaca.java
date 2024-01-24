import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Vaca extends Animal{

    private float[]litrosLeche;

    public Vaca(){
        super();
        litrosLeche=new float[7];
        for (int i = 0; i < litrosLeche.length; i++) {
            litrosLeche[i]= (float) (Math.random()*50);
        }
    }
    public Vaca(String nombre,int edad,float peso){
        super(nombre,edad,peso);
        litrosLeche=new float[7];
        for (int i = 0; i < litrosLeche.length; i++) {
            litrosLeche[i]= (int) (Math.random()*3);
        }
    }

    @Override
    public double media() {
        double total=0;
        for (int i = 0; i < litrosLeche.length; i++) {
            total=litrosLeche[i]+total;
        }
        return total/litrosLeche.length;
    }
    public String toString(){
        return super.toString()+ String.format("y doy \n %s\n La media es de: %.2f\n", Arrays.toString(litrosLeche),media());
    }
    public float[] getLitrosLeche() {
        return litrosLeche;
    }
    public void setLitrosLeche(float[] litrosLeche) {
        this.litrosLeche = litrosLeche;
    }

}
