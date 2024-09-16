/**
 * Creates a new Arithemetic Game
 * 
 * @author Finlay Palmer
 */
public class ArithemeticGame {
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;

    /**
     * Creates a new ArithemeticGame
     */
    public ArithemeticGame() {
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        score = 0;
        state = easyState;
    }

    /**
     * Returns the random question to the user
     * 
     * @return the random question for the user to answer
     */
    public Question getQuestion() {
        return new Question(state.getNum(), state.getNum(), state.getOperation());
    }

    /**
     * Increases the score by one and increases the difficulty if the score is 3
     */
    public void increaseScore() {
        score++;
        if (score >= 3) {
            state.increaseDifficulty();
            score = 0;
        }
    }

    /**
     * Decreases the score by one and decreases the difficulty if the score is -3
     */
    public void decreaseScore() {
        score--;
        if (score <= -3) {
            state.decreaseDifficulty();
            score = 0;
        }
    }

    /**
     * Sets the state to state
     * 
     * @param state the state to change to
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Returns easyState
     * 
     * @return the state easyState
     */
    public State getEasyState() {
        return easyState;
    }

    /**
     * Returns mediumState
     * 
     * @return the state mediumState
     */
    public State getMediumState() {
        return mediumState;
    }

    /**
     * Returns hardState
     * 
     * @return the state hardState
     */
    public State getHardState() {
        return hardState;
    }
}
