package Section10.Generics.Section03;

/**
 * @author Raffi
 */
public class Main {

    public static void main(String[] args) {
        League<Team<FootBall>> footballLeague = new League<>("FIFA");

        Team<FootBall> barcelona = new Team<>("Barcelona");
        Team<FootBall> chelsea = new Team<>("Chelsea");
        Team<FootBall> liverpool = new Team<>("Liverpool");

        footballLeague.addTeam(barcelona);
        footballLeague.addTeam(chelsea);
        footballLeague.addTeam(liverpool);

        barcelona.matchResult(chelsea, 2,0);
        liverpool.matchResult(chelsea,1,1);
        chelsea.matchResult(liverpool,3,0);



        footballLeague.sortLeague();


    }


}
