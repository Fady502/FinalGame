// Fady Zaki SDEV200 14Feb2024
public class Player {
    private String name;
    private int score;
    private int wins;
    private int losses;

    public Player(String name) {
        this.name = name;
        score = 0;
        wins = 0;
        losses = 0;
    }
//Name of player
    public String getName() {
        return name;
    }
// Score of player
    public int getScore() {
        return score;
    }
// Wins of the player
    public int getWins() {
        return wins;
    }
// Losses of the player
    public int getLosses() {
        return losses;
    }
}
