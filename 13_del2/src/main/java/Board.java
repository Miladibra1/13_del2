public class Board {
    int tower, crater, PalaceGates, ColdDesert, WalledCity, Monastery, BlackCave;
    int HutsInTheMountain, TheWereWall, ThePit, Goldmine;

    public Board() {
        tower = 250;
        crater = -100;
        PalaceGates = 100;
        ColdDesert = -20;
        WalledCity = 180;
        Monastery = 0;
        BlackCave = -70;
        HutsInTheMountain = 60;
        TheWereWall = -80;
        ThePit = -50;
        Goldmine = 650;
    }

    public int getFelt(int sum){

        if(sum == 2) {
            System.out.println("Du har landet i tårnet.");
            return tower;
        } else if(sum == 3){
            System.out.println("Av! den koster -100");
            return crater;
        } else if(sum == 4){
            System.out.println("Godt ramt, det er nogle point du nok bliver glad for, senere i spillet");
            return PalaceGates;
        } else if(sum == 5){
            System.out.println("tja, det er til at tage, kom igen");
            return ColdDesert;
        } else if(sum == 6){
            System.out.println("Wauw, det var en ordenlig omgang, kom så!");
            return WalledCity;
        } else if(sum == 7){
            System.out.println("Hmm, 0, prøv igen");
            return Monastery;
        } else if(sum == 8){
            System.out.println("desværre har du endnu engang fået en negativ værdi");
            return BlackCave;
        } else if(sum == 9){
            System.out.println("ikke så meget, men det er fremskridt");
            return HutsInTheMountain;
        } else if(sum == 10){
            System.out.println("nejjj... du kan godt, kom igen");
            return TheWereWall;
        } else if(sum == 11){
            System.out.println("Du er i pitten! stærkt!");
            return ThePit;
        } else if(sum == 12){
            System.out.println("HOLD DA FERIE, JACKPOT, det tager der nok langt fremad, er det nok til en sejr?");
            return Goldmine;
        }
        System.out.println("ukent terningværdi:" + sum);
        return 0;
    }
}

