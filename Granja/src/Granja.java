import java.util.Arrays;

public class Granja {
    private Animal []listaAnimales;

    public Granja() {
        listaAnimales=new Animal[10];
        for (int i = 0; i < listaAnimales.length; i++) {
            if (i%2==0){
             listaAnimales[i]=new Gallina();
            }else {
                listaAnimales[i]=new Vaca();
            }
        }
    }
    public String toString(){
        return String.format("Granja:\n %s", Arrays.toString(listaAnimales));
    }

    public Animal[] getListaAnimales() {
        return listaAnimales;
    }

    public void setListaAnimales(Animal[] listaAnimales) {
        this.listaAnimales = listaAnimales;
    }
}
