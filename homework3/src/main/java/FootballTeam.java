import java.util.List;

public class FootballTeam {

    private String name;
    private String country;
    private List<String> players;

    FootballTeam() {}

    public FootballTeam(String name, String country, List<String> players) {
        this.name = name;
        this.country = country;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<String> getPlayers() {
        return players;
    }

    public void setPlayers(List<String> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "Team = " + name + ", country = " + country + "\nPlayers = " +players;
    }
}
