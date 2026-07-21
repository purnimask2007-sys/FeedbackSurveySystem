import java.util.ArrayList;
import java.util.HashMap;

public class Statistics {

    public static void displayStatistics(Survey survey, ArrayList<Response> responses) {

        System.out.println("\n==============================================");
        System.out.println("          SURVEY STATISTICS");
        System.out.println("==============================================");

        if (responses.isEmpty()) {
            System.out.println("No responses available.");
            return;
        }

        for (Question question : survey.getQuestions()) {

            System.out.println("\nQuestion " + question.getQuestionId() + ":");
            System.out.println(question.getQuestionText());

            ArrayList<String> options = question.getOptions();

            // optionNumber -> voteCount
            HashMap<Integer, Integer> voteCount = new HashMap<>();

            // Initialize vote counts
            for (int i = 1; i <= options.size(); i++) {
                voteCount.put(i, 0);
            }

            // Count votes
            for (Response response : responses) {

                int selectedOption = response.getAnswer(question.getQuestionId());

                if (selectedOption != -1) {
                    voteCount.put(selectedOption,
                            voteCount.get(selectedOption) + 1);
                }
            }

            int maxVotes = -1;
            int bestOption = -1;

            System.out.println("\nResults:");

            for (int i = 1; i <= options.size(); i++) {

                int votes = voteCount.get(i);

                System.out.println(
                        i + ". " + options.get(i - 1)
                        + " -> " + votes + " vote(s)");

                if (votes > maxVotes) {
                    maxVotes = votes;
                    bestOption = i;
                }
            }

            System.out.println("----------------------------------");
            System.out.println("Total Responses : " + responses.size());

            if (bestOption != -1) {
                System.out.println("Most Selected   : "
                        + options.get(bestOption - 1));
            }

            System.out.println("----------------------------------");
        }
    }
}
