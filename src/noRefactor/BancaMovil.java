package noRefactor;

public class BancaMovil {
    private int id;
    private int saldo;
    private String clabe;
    private String version;
    private String oS;

    public BancaMovil(int id, int saldo) {
        this.id = id;
        this.saldo = saldo;
        this.clabe = generarClabe();
    }

    private String generarClabe(){
        return String.valueOf(Math.random()*10);
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getoS() {
        return oS;
    }

    public void setoS(String oS) {
        this.oS = oS;
    }
}
