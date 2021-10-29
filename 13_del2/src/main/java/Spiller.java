public class Spiller {

    private Konto konto;
    private Die die;

    private String navn;

    public Spiller(String navn){
        this.navn = navn;
        this.konto = new Konto();
        this.die = new Die();
    }

    public int rollDice() {
        return die.rollDice();
    }

    public String getNavn() {
        return navn;
    }
    public boolean haev(int penge) {
        return konto.haev(penge);
    }
    public int getSaldo() {
        return konto.getSaldo();
    }

}