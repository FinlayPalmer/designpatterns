/**
 * Creates a State for an ArithemeticGame
 * 
 * @author Finlay Palmer
 */
public interface State {
    /**
     * Returns a random number to operate on depending on the difficulty
     * 
     * @return a random number to operate on
     */
    public int getNum();

    /**
     * Returns a random operator to operate with depending on the difficulty
     * 
     * @return a random operator to operate with
     */
    public Operation getOperation();

    /**
     * Increases the difficulty if able to
     */
    public void increaseDifficulty();

    /**
     * Decreases the difficulty if able to
     */
    public void decreaseDifficulty();
}
