import java.util.ArrayList;

public class Question {

    private int questionId;
    private String questionText;
    private ArrayList<String> options;

    // Constructor
    public Question(int questionId, String questionText) {
        this.questionId = questionId;
        this.questionText = questionText;
        this.options = new ArrayList<>();
    }

    // Add an option
    public void addOption(String option) {
        options.add(option);
    }

    // Get Question ID
    public int getQuestionId() {
        return questionId;
    }

    // Get Question Text
    public String getQuestionText() {
        return questionText;
    }

    // Get Options
    public ArrayList<String> getOptions() {
        return options;
    }

    // Display Question
    public void displayQuestion() {
        System.out.println("\nQuestion " + questionId + ":");
        System.out.println(questionText);

        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
    }
}
