import java.util.ArrayList;

public class Survey {

    private String surveyTitle;
    private ArrayList<Question> questions;

    // Constructor
    public Survey(String surveyTitle) {
        this.surveyTitle = surveyTitle;
        this.questions = new ArrayList<>();
    }

    // Add a question to the survey
    public void addQuestion(Question question) {
        questions.add(question);
    }

    // Get survey title
    public String getSurveyTitle() {
        return surveyTitle;
    }

    // Get all questions
    public ArrayList<Question> getQuestions() {
        return questions;
    }

    // Get total number of questions
    public int getQuestionCount() {
        return questions.size();
    }

    // Get a question by index
    public Question getQuestion(int index) {
        if (index >= 0 && index < questions.size()) {
            return questions.get(index);
        }
        return null;
    }

    // Display the complete survey
    public void displaySurvey() {
        System.out.println("\n======================================");
        System.out.println("        " + surveyTitle);
        System.out.println("======================================");

        for (Question question : questions) {
            question.displayQuestion();
        }
    }
}
