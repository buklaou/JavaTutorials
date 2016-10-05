package Section02.OOP.Section06.CompositionPt2;

/**
 * @author Raffi
 */
public class Closet {

    private Clothes clothes;
    private int howManyShoes;
    private boolean suit;

    public Closet(Clothes clothes, int howManyShoes, boolean suit) {
        this.clothes = clothes;
        this.howManyShoes = howManyShoes;
        this.suit = suit;
    }

    public void clean() {
        System.out.println("Closet is clean.");
    }

    public Clothes getClothes() {
        return clothes;
    }

    public int getHowManyShoes() {
        return howManyShoes;
    }

    public boolean isSuit() {
        return suit;
    }
}
