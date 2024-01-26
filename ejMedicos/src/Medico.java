public abstract class Medico {
    protected String nombre;
    protected int edad;
    protected char sexo;
    protected double horas;
    protected double salarioHora;

    public Medico(){
        this.nombre="Paco";
        this.edad=(int)(Math.random()*40+20);
        this.sexo='M';
        this.horas=8;
        this.salarioHora=15;
    }
    public Medico(String nombre, int edad, char sexo, double horas, double salarioHora) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.horas = horas;
        this.salarioHora = salarioHora;
    }
    public abstract double CalcularSalario();
    @Override
    public String toString() {
        return "Medico{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", horas=" + horas +
                ", salarioHora=" + salarioHora +
                '}';
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }
}
