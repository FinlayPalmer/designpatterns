/**
 * Creates a medium State for an ArithemeticGame
 * 
 * @author Finlay Palmer
 */
public class Medium implements State {
    private ArithemeticGame game;

    /**
     * Creates a medium state for an ArithemeticGame
     * 
     * @param game the ArithemeticGame
     */
    public Medium(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * returns a random number between 1 and 25
     * 
     * @return A random number between 1 and 25
     */
    public int getNum() {
        return (int) (25 * Math.random()) + 1;
    }

    /**
     * returns a random Operation, either +, -, or *
     * 
     * @return A random Operation, either +, -, or *
     */
    public Operation getOperation() {
        int ran = (int) (3 * Math.random());
        if (ran == 0) {
            return Operation.MINUS;
        } else if (ran == 1) {
            return Operation.MULTIPLY;
        }
        return Operation.PLUS;
    }

    /**
     * Increases the Difficulty to Hard
     */
    public void increaseDifficulty() {
        game.setState(game.getHardState());
        System.out.println("Level increased to: Hard");
    }

    /**
     * Decreases the Difficulty to Easy
     */
    public void decreaseDifficulty() {
        game.setState(game.getEasyState());
        System.out.println("Level decreased to: Easy");
    }
}
