package Refactor;

public class RefactorSistemaBancario {
    private int id;
    private int saldo;
    private String clabe;


    private String generarClabe(){
        return String.valueOf(Math.random()*1000);
    }

    public RefactorSistemaBancario(int id, int saldo) {
        this.id = id++;
        this.saldo = saldo;
        this.clabe = generarClabe();
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }
}
