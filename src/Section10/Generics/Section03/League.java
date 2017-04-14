package Section10.Generics.Section03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Raffi
 */
public class League<T extends Team> {

    public String name;
    private List<T> leagueList = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T team) {
        if (leagueList.contains(team)) {
            System.out.println(team.getName() + " is already in the league.");
            return false;
        } else {
            leagueList.add(team);
            return true;
        }
    }

    public void sortLeague() {
        Collections.sort(leagueList);
        for (T t : leagueList) {
            System.out.println(t.getName() + ": " + t.ranking());
        }

    }
}
