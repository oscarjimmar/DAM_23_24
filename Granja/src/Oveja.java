import java.util.Arrays;

public class Oveja extends Animal{
    private int []lanaSemana;

    public Oveja() {
        super();
        lanaSemana=new int[7];
        for (int i = 0; i < lanaSemana.length; i++) {
            lanaSemana[i]= (int) (Math.random()*20+1);
        }
    }

    public Oveja(String nombre, int edad, float peso) {
        super(nombre, edad, peso);
        lanaSemana=new int[7];
        for (int i = 0; i < lanaSemana.length; i++) {
            lanaSemana[i]= (int) (Math.random()*3);
        }
    }

    public int[] getLanaSemana() {
        return lanaSemana;
    }

    public void setLanaSemana(int[] lana) {
        this.lanaSemana = lana;
    }
    public String toString(){
        return super.toString()+ String.format("y doy \n %s\n", Arrays.toString(lanaSemana));
    }
}
