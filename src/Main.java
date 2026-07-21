import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SurveyService surveyService = new SurveyService();

        int choice;

        do {

            System.out.println("\n==============================================");
            System.out.println("      FEEDBACK / SURVEY COLLECTION SYSTEM");
            System.out.println("==============================================");
            System.out.println("1. View Survey");
            System.out.println("2. Submit Feedback");
            System.out.println("3. View Statistics");
            System.out.println("4. View All Responses");
            System.out.println("5. Total Responses");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input! Enter a number: ");
                scanner.next();
            }

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    surveyService.viewSurvey();
                    break;

                case 2:
                    surveyService.submitFeedback();
                    break;

                case 3:
                    surveyService.viewStatistics();
                    break;

                case 4:
                    surveyService.viewAllResponses();
                    break;

                case 5:
                    System.out.println("\nTotal Responses Submitted: "
                            + surveyService.getTotalResponses());
                    break;

                case 6:
                    System.out.println("\n==============================================");
                    System.out.println("Thank you for using the");
                    System.out.println("Feedback / Survey Collection System.");
                    System.out.println("Goodbye!");
                    System.out.println("==============================================");
                    break;

                default:
                    System.out.println("\nInvalid choice! Please try again.");
            }

        } while (choice != 6);

        scanner.close();
    }
}
