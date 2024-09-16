public class Question {
    private String question;
    private int answer;

    public Question(int num1, int num2, Operation operation) {
        question = Integer.toString(num1) + " " + operation.label + " " + Integer.toString(num2);
        if (operation.label.equals(Operation.PLUS.label)) {
            answer = num1 + num2;
        } else if (operation.label.equals(Operation.MINUS.label)) {
            answer = num1 - num2;
        } else if (operation.label.equals(Operation.MULTIPLY.label)) {
            answer = num1 * num2;
        } else {
            answer = num1 / num2;
        }
    }

    public String toString() {
        return question;
    }

    public int getAnswer() {
        return answer;
    }

    public boolean isCorrect(int answer) {
        if (this.answer == answer) {
            return true;
        } else {
            return false;
        }
    }
}
