import java.util.ArrayList;

/**
 * Creates a new Question
 * 
 * @author Finlay Palmer
 */
public class Question {
    private String question;
    private ArrayList<String> answers;
    private int correctAnswer;

    /**
     * Creates a new Question
     * 
     * @param question      String representing the Question
     * @param correctAnswer The correct number of the answer to the question
     * @param answers       All possible answers to the question
     */
    public Question(String question, int correctAnswer, String... answers) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.answers = new ArrayList<String>();
        for (int i = 0; i < answers.length; i++) {
            this.answers.add(i, answers[i]);
        }
    }

    /**
     * Returns a String representing the question
     * 
     * @return A String representing the question
     */
    public String toString() {
        return "\n" + question + "\n 1. " + answers.get(0) + "\n 2. " + answers.get(1) + "\n 3. " + answers.get(2)
                + "\n 4. " + answers.get(3) + "\n";
    }

    /**
     * Returns if the user's answer is correct
     * 
     * @param userAnswer The user's answer
     * @return true if the user's answer is correct, false if not
     */
    public boolean isCorrect(int userAnswer) {
        return ((userAnswer - 1) == correctAnswer);
    }

    /**
     * Returns the correct answer for the question
     * 
     * @return A String representing the correct answer
     */
    public String getCorrectAnswer() {
        return answers.get(correctAnswer);
    }
}
