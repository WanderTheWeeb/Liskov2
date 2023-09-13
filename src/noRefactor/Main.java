package noRefactor;

public class Main {
    public static void main(String[] args) {
        BancaMovil appIos = new BancaMovil(1,25);
        ATM atm = new ATM(5,80);
        System.out.println(atm.getClabe());
        System.out.println(appIos.getClabe());
    }


}
