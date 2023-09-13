package Refactor;

public class Main {
    public static void main(String[] args) {
        RefactorSistemaBancario sistema = new RefactorSistemaBancario(1,0);

        System.out.println("Su clabe es " +sistema.getClabe());
        System.out.println("Su saldo es: "+ sistema.getSaldo());

    }
}
