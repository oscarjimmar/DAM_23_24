public class Gallina {
    private String nombre;
    private int edad;
    private float peso;

    private static final String [] nombres={"Paco","Maksim","Quien","Goku","MartyMcfly"};
    public static String getNombreAleatorio(){
        return nombres[(int) (Math.random()* nombres.length)];
    }
    public Gallina(){
        nombre =getNombreAleatorio();
        peso= (float) (Math.random()*3+1);
        edad= (int) (Math.random()*9+1);
    }
    public Gallina(String nombre,int edad, float peso){
        this.nombre=nombre;
        this.edad=edad;
        this.peso=peso;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /*public void mostrarInfo(){
        System.out.println("Me llamo "+nombre+" tengo "+edad+" años y peso "+peso+" kg");
    }*/
    public String toString(){
        return String.format("Mellamo %s, este es mi peso %.2f y tengo %d años");
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float getPeso() {
        return peso;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
}
