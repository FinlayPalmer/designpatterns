public class Hard implements State {
    private ArithemeticGame game;

    public Hard(ArithemeticGame game) {
        this.game = game;
    }

    public int getNum() {
        return (int) (50 * Math.random()) + 1;
    }

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

    public void increaseDifficulty() {
        System.out.println("You're doing great!");
    }

    public void decreaseDifficulty() {
        game.setState(game.getMediumState());
        System.out.println("Level decreased to: Medium");
    }
}
