import java.util.HashMap;

public class Response {

    private String respondentName;
    private HashMap<Integer, Integer> answers;

    // Constructor
    public Response(String respondentName) {
        this.respondentName = respondentName;
        this.answers = new HashMap<>();
    }

    // Save answer
    public void addAnswer(int questionId, int selectedOption) {
        answers.put(questionId, selectedOption);
    }

    // Get respondent name
    public String getRespondentName() {
        return respondentName;
    }

    // Get all answers
    public HashMap<Integer, Integer> getAnswers() {
        return answers;
    }

    // Get answer for a specific question
    public int getAnswer(int questionId) {
        return answers.getOrDefault(questionId, -1);
    }

    // Display participant responses
    public void displayResponse() {
        System.out.println("\nRespondent: " + respondentName);

        for (Integer questionId : answers.keySet()) {
            System.out.println(
                "Question " + questionId +
                " -> Option " + answers.get(questionId)
            );
        }
    }
}
