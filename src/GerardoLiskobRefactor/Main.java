package GerardoLiskobRefactor;

public class Main {

    public static void imprimirArea(Figura figura){
        double area = figura.calcularArea();
        System.out.println("El area es: "+area);
    }

    public static void main(String[] args) {
        Figura cuadrado = new Cuadrado(13);
        Figura circulo = new Circulo(69);

        imprimirArea(cuadrado);
        imprimirArea(circulo);
    }
}
