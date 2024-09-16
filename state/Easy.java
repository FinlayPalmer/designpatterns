public class Easy implements State {
    private ArithemeticGame game;

    public Easy(ArithemeticGame game) {
        this.game = game;
    }

    public int getNum() {
        return (int) (10 * Math.random()) + 1;
    }

    public Operation getOperation() {
        int ran = (int) (2 * Math.random());
        if (ran == 0) {
            return Operation.MINUS;
        }
        return Operation.PLUS;
    }

    public void increaseDifficulty() {
        game.setState(game.getMediumState());
        System.out.println("Level increased to: Medium");
    }

    public void decreaseDifficulty() {
        System.out.println("Keep studying");
    }
}
