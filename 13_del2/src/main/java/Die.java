import java.util.Random;


public class Die {
    int die1, die2;

    Random rand = new Random();

    public int rollDice() {
        die1 = rand.nextInt(6) + 1;
        die2 = rand.nextInt(6) + 1 ;
        return  die1 + die2;
    }

    public int getDie1() {
        return this.die1;
    }

    public int getDie2() {
        return this.die2;
    }
}
