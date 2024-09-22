import java.util.ArrayList;

public class Question {
    private String question;
    private ArrayList<String> answers;
    private int correctAnswer;

    public Question(String question, int correctAnswer, String[] answers) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.answers = new ArrayList<String>();
        for (int i = 0; i < answers.length; i++) {
            this.answers.add(i, answers[i]);
        }
    }

    public String toString() {
        return question + "\n1. " + answers.get(0) + "\n2. " + answers.get(1) + "\n3. " + answers.get(2) + "\n4. "
                + answers.get(3);
    }

    public boolean isCorrect(int userAnswer) {
        return ((userAnswer-1)==correctAnswer);
    }

    public String getCorrectAnswer() {
        return answers.get(correctAnswer);
    }
}
