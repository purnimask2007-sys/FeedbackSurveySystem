import java.util.ArrayList;
import java.util.Scanner;

public class SurveyService {

    private Survey survey;
    private ArrayList<Response> responses;
    private Scanner scanner;

    // Constructor
    public SurveyService() {
        responses = new ArrayList<>();
        scanner = new Scanner(System.in);
        createDefaultSurvey();
    }

    // Create default survey
    private void createDefaultSurvey() {

        survey = new Survey("Student Feedback Survey");

        Question q1 = new Question(1, "How would you rate the teaching quality?");
        q1.addOption("Excellent");
        q1.addOption("Good");
        q1.addOption("Average");
        q1.addOption("Poor");

        Question q2 = new Question(2, "Would you recommend this college?");
        q2.addOption("Yes");
        q2.addOption("No");

        Question q3 = new Question(3, "How would you rate the laboratory facilities?");
        q3.addOption("Excellent");
        q3.addOption("Good");
        q3.addOption("Average");
        q3.addOption("Poor");

        Question q4 = new Question(4, "How satisfied are you with campus cleanliness?");
        q4.addOption("Very Satisfied");
        q4.addOption("Satisfied");
        q4.addOption("Neutral");
        q4.addOption("Dissatisfied");

        survey.addQuestion(q1);
        survey.addQuestion(q2);
        survey.addQuestion(q3);
        survey.addQuestion(q4);
    }

    // View survey
    public void viewSurvey() {
        survey.displaySurvey();
    }

    // Submit feedback
    public void submitFeedback() {

        System.out.println("\n========== Submit Feedback ==========");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        Response response = new Response(name);

        for (Question question : survey.getQuestions()) {

            question.displayQuestion();

            int choice;

            while (true) {

                System.out.print("Enter your choice: ");

                if (scanner.hasNextInt()) {

                    choice = scanner.nextInt();

                    if (choice >= 1 && choice <= question.getOptions().size()) {
                        break;
                    } else {
                        System.out.println("Invalid option. Try again.");
                    }

                } else {
                    System.out.println("Please enter a number.");
                    scanner.next();
                }
            }

            response.addAnswer(question.getQuestionId(), choice);
        }

        scanner.nextLine();

        responses.add(response);

        System.out.println("\nFeedback submitted successfully.");
    }

    // View statistics
    public void viewStatistics() {
        Statistics.displayStatistics(survey, responses);
    }

    // View all responses
    public void viewAllResponses() {

        if (responses.isEmpty()) {
            System.out.println("\nNo responses available.");
            return;
        }

        System.out.println("\n========== All Responses ==========");

        for (Response response : responses) {
            response.displayResponse();
            System.out.println("--------------------------------");
        }
    }

    // Total participants
    public int getTotalResponses() {
        return responses.size();
    }
}
