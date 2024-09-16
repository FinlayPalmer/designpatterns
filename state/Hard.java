/**
 * Creates a hard State for an ArithemeticGame
 * 
 * @author Finlay Palmer
 */
public class Hard implements State {
    private ArithemeticGame game;

    /**
     * Creates a hard state for an ArithemeticGame
     * 
     * @param game the ArithemeticGame
     */
    public Hard(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * returns a random number between 1 and 50
     * 
     * @return A random number between 1 and 50
     */
    public int getNum() {
        return (int) (50 * Math.random()) + 1;
    }

    /**
     * returns a random Operation, either +, -, *, or /
     * 
     * @return A random Operation, either +, -, *, or /
     */
    public Operation getOperation() {
        int ran = (int) (4 * Math.random());
        if (ran == 0) {
            return Operation.MINUS;
        } else if (ran == 1) {
            return Operation.MULTIPLY;
        } else if (ran == 2) {
            return Operation.DIVIDE;
        }
        return Operation.PLUS;
    }

    /**
     * Tells the user they're doing great
     */
    public void increaseDifficulty() {
        System.out.println("You're doing great!");
    }

    /**
     * Decreases the Difficulty to Medium
     */
    public void decreaseDifficulty() {
        game.setState(game.getMediumState());
        System.out.println("Level decreased to: Medium");
    }
}
