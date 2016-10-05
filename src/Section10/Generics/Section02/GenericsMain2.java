package Section10.Generics.Section02;

/**
 * @author Raffi
 */
public class GenericsMain2 {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer bill = new BaseballPlayer("Bill");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");


        Team adelaideCrows = new Team("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        adelaideCrows.addPlayer(beckham);
        adelaideCrows.addPlayer(bill);

        System.out.println(adelaideCrows.numPlayers());
        System.out.println(adelaideCrows.getName());
    }


}
