import java.util.Arrays;

public class Gallina extends Animal {

    private int[]huevosSemana ;
    //private static final float PESOMINIMOGALLINA=3;
    //private static final float PESOMAXIMOGALLINA =8;

    //constructor
    /*public Gallina(){
        nombre =Utilidades.nombres[(int) (Math.random()*Utilidades.nombres.length)];
        peso= (float) (Math.random()*3+1);
        edad= (int) (Math.random()*9+1);
        huevosSemana=new int[7];
        for (int i = 0; i < huevosSemana.length; i++) {
            huevosSemana[i]= (int) (Math.random()*2);
        }
    }*/
    public Gallina(){
        super();
        huevosSemana=new int[7];
        for (int i = 0; i < huevosSemana.length; i++) {
            huevosSemana[i]= (int) (Math.random()*3);
        }
    }
    public Gallina(String nombre,int edad, float peso){
        super(nombre,edad,peso);
        huevosSemana=new int[7];
        for (int i = 0; i < huevosSemana.length; i++) {
            huevosSemana[i]= (int) (Math.random()*3);
        }
    }

    public void huevosDia(int dia, int huevos){
        huevosSemana[dia-1]=huevos;
    }


    //ver datos
    /*public void mostrarInfo(){
        System.out.println("Me llamo "+nombre+" tengo "+edad+" años y peso "+peso+" kg");
    }*/
    /*public String toString(){
        return String.format("Me llamo %s, este es mi peso %.2f y tengo %d años y pongo a la semana \n %s",nombre,peso,edad, Arrays.toString(huevosSemana));
    }*/
    //geter y seter


    public void setHuevosSemana(int[] huevosSemana) {
        this.huevosSemana = huevosSemana;
    }
    public int[] getHuevosSemana() {
        return huevosSemana;
    }
    public String toString(){
        return super.toString() + String.format("y pongo \n %s\n",Arrays.toString(huevosSemana));
    }
}
