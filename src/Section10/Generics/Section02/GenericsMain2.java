package Section10.Generics.Section02;

/**
 * @author Raffi
 */
public class GenericsMain2 {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer bill = new BaseballPlayer("Bill");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");


        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);

        System.out.println(adelaideCrows.numPlayers());
        System.out.println(adelaideCrows.getName());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(bill);

        /*This will not work because the type parameter in the Team class
        * only accepts classes that extend Player.*/

        /*Team<String> brokenTeam = new Team<>("this won't work");
        brokenTeam.addPlayer("no one");*/

        Team<SoccerPlayer> workingTeam = new Team<>("TestTeam");
        workingTeam.addPlayer(beckham);
        Team<SoccerPlayer> workingTeam2 = new Team<>("TestTeam2");

        workingTeam.matchResult(workingTeam2, 1, 0);

        System.out.println("Rankings:");
        System.out.println(workingTeam.getName() + ":" + workingTeam.ranking());
        System.out.println(workingTeam2.getName() + ":" + workingTeam2.ranking());

    }


}
