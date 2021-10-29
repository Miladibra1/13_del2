public class Konto {
    private int saldo;

    public Konto(){
        saldo = 1000;
    }

    public boolean haev(int penge){

        if((saldo + penge) < 0)
            return false;

        saldo = saldo + penge;
        return true;
    }

    public int getSaldo() {
        return saldo;
    }
}
