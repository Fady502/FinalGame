// Fady Zaki SDEV200 Feb142024
import java.util.Random;

public class Game {
    private String currentPlayer;
    private String currentGameMode;
    private int currentGuesses;
    private int playerScore;
    private int numberToGuess;
    private int numberRange;

    public void startNewGame(String playerName, String gameMode) {
        currentPlayer = playerName;
        currentGameMode = gameMode;
        currentGuesses = 0;
        playerScore = 0;

        switch (gameMode) {
            case "Simple":
                numberRange = 10;
                break;
            case "Standard":
                numberRange = 25;
                break;
            case "Difficult":
                numberRange = 50;
                break;
        }
        generateRandomNumber();
    }

    private void generateRandomNumber() {
        Random rand = new Random();
        numberToGuess = rand.nextInt(numberRange) + 1;
    }
//Computer responses
    public void makeGuess(int guess) {
        currentGuesses++;
        if (guess == numberToGuess) {
            playerScore += getScoreForGameMode();
            System.out.println("Congratulations! You guessed the number in " + currentGuesses + " guesses.");
            endGame();
        } else if (guess < numberToGuess) {
            System.out.println("Higher! Guess again.");
        } else {
            System.out.println("Lower! Guess again.");
        }
    }
//Points
    private int getScoreForGameMode() {
        switch (currentGameMode) {
            case "Simple":
                return 1;
            case "Standard":
                return 3;
            case "Difficult":
                return 5;
            default:
                return 0;
        }
    }

    public void endGame() {
        // Save player's score or perform any necessary actions
    }

    public void displayMenu() {
        // Display menu options
    }
}
