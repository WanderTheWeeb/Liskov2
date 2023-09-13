package GerardoLiskobRefactor;

public class Cuadrado extends Figura{
    private double lado;


    public Cuadrado(double lado1) {
        this.lado = lado1;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
