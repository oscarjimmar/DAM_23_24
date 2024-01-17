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

    public double[] getComidaConsume() {
        return comidaConsume;
    }

    public void setComidaConsume(double[] comidaConsume) {
        this.comidaConsume = comidaConsume;
    }
}
