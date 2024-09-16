/**
 * Creates an easy State for an ArithemeticGame
 * 
 * @author Finlay Palmer
 */
public class Easy implements State {
    private ArithemeticGame game;

    /**
     * Creates an easy state for an ArithemeticGame
     * 
     * @param game the ArithemeticGame
     */
    public Easy(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * returns a random number between 1 and 10
     * 
     * @return A random number between 1 and 10
     */
    public int getNum() {
        return (int) (10 * Math.random()) + 1;
    }

    /**
     * returns a random Operation, either + or -
     * 
     * @return A random Operation, either + or -
     */
    public Operation getOperation() {
        int ran = (int) (2 * Math.random());
        if (ran == 0) {
            return Operation.MINUS;
        }
        return Operation.PLUS;
    }

    /**
     * Increases the Difficulty to Medium
     */
    public void increaseDifficulty() {
        game.setState(game.getMediumState());
        System.out.println("Level increased to: Medium");
    }

    /**
     * Tells the user to keep studying
     */
    public void decreaseDifficulty() {
        System.out.println("Keep studying");
    }
}
