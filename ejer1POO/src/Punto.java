public class Punto {
    private double x;
    private  double y;

     public Punto(double x,double y){
         this.x=x;
         this.y=y;
     }
    public Punto(){
         x=Math.random()*10-5;
         y=Math.random()*10-5;
    }

    public double calcularDistancia(Punto punto){
        double distanciax=punto.getX()-x;
        double distanciay=punto.getX()-y;
        return Math.sqrt(distanciax-x+distanciay-y);
    }

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void setX(double x) {
        this.x = x;
    }
    public double getX() {
        return x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getY() {
        return y;
    }
}
