import java.util.Arrays;

public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected float peso;
    //protected float pesoMinimo;
    //protected float pesoMaximo;
    public Animal(){
        nombre =Utilidades.nombres[(int) (Math.random()*Utilidades.nombres.length)];
        peso= (float) (Math.random()*3+1);
        edad= (int) (Math.random()*100+1);
        //this("paco",3,4);
    }

    public Animal(String nombre, int edad, float peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
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

   /* public float getPesoMinimo() {
        return pesoMinimo;
    }

    public void setPesoMinimo(float pesoMinimo) {
        this.pesoMinimo = pesoMinimo;
    }

    public float getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(float pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }*/
    public String toString(){
        return this.getClass().getSimpleName()+ String.format(":\nMe llamo %s, este es mi peso %.2f y tengo %d años ",nombre,peso,edad);
    }
}
