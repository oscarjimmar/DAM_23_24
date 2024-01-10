public class Circulo {
    private Punto punto;
    private double radio;
    public Circulo(Punto puntoCentro,double radioCirc){
        punto=puntoCentro;
        radio=radioCirc;
    }
    public Circulo(){
    }
    public Circulo(double x,double y,double radioCirculo){
        punto=new Punto(x,y);
        radio=radioCirculo;
    }
    public double calcularDistanciaDesde(Punto otropunto){
        return punto.calcularDistancia(otropunto);
    }
    @Override
    public String toString() {
        return "Circulo{" +
                "punto=" + punto +
                ", area=" + radio +
                '}';
    }

    public double getArea() {
        return radio;
    }

    public void setArea(double area) {
        this.radio = area;
    }

    public Punto getPunto() {
        return punto;
    }

    public void setPunto(Punto punto) {
        this.punto = punto;
    }


}
