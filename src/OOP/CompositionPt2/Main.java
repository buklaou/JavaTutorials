package OOP.CompositionPt2;

/**
 * Created by Raffi on 12/28/2015.
 */
public class Main {

    public static void main(String[] args) {

        Bed bed = new Bed(60,30,"wood");
        Table table = new Table("wood", new Dimensions(40,25));
        Closet closet = new Closet(new Clothes("Casual",2,"Red"),4,true);

        Bedroom bedroom = new Bedroom(bed,table,closet);

        bedroom.clean();
        bedroom.getCloset().clean();



    }
}
