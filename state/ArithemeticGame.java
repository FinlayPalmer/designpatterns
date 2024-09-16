public class ArithemeticGame {
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;

    public ArithemeticGame() {
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        score = 0;
        state = easyState;
    }

    public Question getQuestion() {
        return new Question(state.getNum(), state.getNum(), state.getOperation());
    }

    public void increaseScore() {
        score++;
        if (score >= 3) {
            state.increaseDifficulty();
            score=0;
        }
    }

    public void decreaseScore() {
        score--;
        if (score <= -3) {
            state.decreaseDifficulty();
            score=0;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getEasyState() {
        return easyState;
    }

    public State getMediumState() {
        return mediumState;
    }

    public State getHardState() {
        return hardState;
    }
}
