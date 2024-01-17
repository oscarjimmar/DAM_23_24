import java.util.Arrays;

public class Cerdo extends Animal{
    private double[] comidaConsume;

    public Cerdo() {
        super();
        comidaConsume=new double[7];
        for (int i = 0; i < comidaConsume.length; i++) {
            comidaConsume[i]=(int) (Math.random()*10+1);
        }
    }

    public Cerdo(String nombre, int edad, float peso) {
        super(nombre, edad, peso);
        comidaConsume=new double[7];
        for (int i = 0; i < comidaConsume.length; i++) {
            comidaConsume[i]=(int) (Math.random()*10+1);
        }
    }
    private double comidaMedia(){
        double total=0;
        for (int i = 0; i < comidaConsume.length; i++) {
            total=comidaConsume[i]+total;
        }
        return total/comidaConsume.length;
    }
    public String toString(){
        return super.toString()+ String.format("y doy \n %s\n La media de comida consumida es de: %.2f\n", Arrays.toString(comidaConsume),comidaMedia());
    }
    public double[] getComidaConsume() {
        return comidaConsume;
    }

    public void setComidaConsume(double[] comidaConsume) {
        this.comidaConsume = comidaConsume;
    }
}
