public class Medium implements State {
    private ArithemeticGame game;

    public Medium(ArithemeticGame game) {
        this.game = game;
    }

    public int getNum() {
        return (int) (25 * Math.random()) + 1;
    }

    public Operation getOperation() {
        int ran = (int) (3 * Math.random());
        if (ran == 0) {
            return Operation.MINUS;
        } else if (ran == 1) {
            return Operation.MULTIPLY;
        }
        return Operation.PLUS;
    }

    public void increaseDifficulty() {
        game.setState(game.getHardState());
        System.out.println("Level increased to: Hard");
    }

    public void decreaseDifficulty() {
        game.setState(game.getEasyState());
        System.out.println("Level decreased to: Easy");
    }
}
