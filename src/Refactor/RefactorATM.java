package Refactor;

public class RefactorATM extends RefactorSistemaBancario{
    private String region;

    public RefactorATM(int id, int saldo, String region) {
        super(id, saldo);
        this.region = region;
    }
}
