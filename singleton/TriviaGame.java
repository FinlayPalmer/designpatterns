import java.util.ArrayList;
import java.util.Random;

/**
 * Creates a new TriviaGame
 * 
 * @author Finlay Palmer
 */
public class TriviaGame {
    private static TriviaGame triviaGame;
    private int score;
    private int numGames;
    private Random rand;
    private ArrayList<Question> questions;

    /**
     * Creates a new TriviaGame
     */
    private TriviaGame() {
        score = 0;
        numGames = 0;
        rand = new Random();
        questions = DataLoader.getTriviaQuestions();
    }

    /**
     * Get the instance of TriviaGame and create it if the instance is null
     * 
     * @return the instance of TriviaGame
     */
    public static TriviaGame getInstance() {
        if (triviaGame == null) {
            triviaGame = new TriviaGame();
        }
        return triviaGame;
    }

    /**
     * Returns a random question from questions
     * 
     * @return A random question from questions
     */
    public Question getQuestion() {
        if (hasMoreQuestions()) {
            return questions.remove(rand.nextInt(questions.size()));
        }
        System.out.println("Game is Over! Thanks for playing!");
        return null;
    }

    /**
     * Returns true if there are more questions in questions
     * 
     * @return True if there are more questions in questions, false if there are not
     */
    public boolean hasMoreQuestions() {
        return (questions.size() > 0);
    }

    /**
     * Increases score and number of games playes
     */
    public void winRound() {
        score++;
        numGames++;
    }

    /**
     * Increases number of games played
     */
    public void loseRound() {
        numGames++;
    }

    /**
     * Gets a String of the score
     * 
     * @return A String represting the score out of number of games
     */
    public String getScores() {
        return "You scored " + score + "/" + numGames;
    }
}
