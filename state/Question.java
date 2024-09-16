/**
 * Creates a new Question
 * 
 * @author Finlay Palmer
 */
public class Question {
    private String question;
    private int answer;

    /**
     * Creates a new Question for the user
     * 
     * @param num1      The first number to operate on
     * @param num2      The second number to operate on
     * @param operation The operation for the numbers
     */
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

    /**
     * Returns a string of the question
     * 
     * @return The question
     */
    public String toString() {
        return question;
    }

    /**
     * Returns the answer to the question
     * 
     * @return The answer
     */
    public int getAnswer() {
        return answer;
    }

    /**
     * Returns true if the user's answer is correct, otherwise returns false
     * 
     * @param answer The user's answer
     * @return True if the user's answer is correct, otherwise false
     */
    public boolean isCorrect(int answer) {
        if (this.answer == answer) {
            return true;
        } else {
            return false;
        }
    }
}
