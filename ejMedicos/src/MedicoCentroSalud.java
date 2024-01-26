import java.util.PrimitiveIterator;

public class MedicoCentroSalud extends Medico{
    private CentroSalud centro;

    public MedicoCentroSalud() {
        super();
    }

    public MedicoCentroSalud(String nombre, int edad, char sexo, double horas, double salarioHora, CentroSalud centro) {
        super(nombre, edad, sexo, horas, salarioHora);
        this.centro = centro;
    }

    @Override
    public double CalcularSalario() {
        return getHoras()*getSalarioHora();
    }

    public CentroSalud getCentro() {
        return centro;
    }

    public void setCentro(CentroSalud centro) {
        this.centro = centro;
    }
}
