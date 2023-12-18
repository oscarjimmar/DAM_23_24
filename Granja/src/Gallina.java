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
    public void mostrarInfo(){
        System.out.println("Me llamo "+nombre+" tengo "+edad+" años y peso "+peso+" kg");
    }
}
