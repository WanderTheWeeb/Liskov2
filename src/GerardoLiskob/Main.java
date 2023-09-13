package GerardoLiskob;

public class Main {
    public static void main(String[] args) {
        Figura cuadrado = new Cuadrado(45,45);

        System.out.println("El area del cuadrao: "+cuadrado.calcularArea());

        Figura trangulo = new Triangulo(45,45);
        System.out.println("El area del triangulo es: "+trangulo.calcularArea());
    }
}
