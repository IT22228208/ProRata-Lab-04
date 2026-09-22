import java.util.Scanner;

public class IT22228208Lab4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input exam marks
        System.out.print("Please enter exam marks (out of 100): ");
        double examMarks = scanner.nextDouble();

        // Validate exam marks
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            scanner.close();
            return;
        }

        // Input lab submission marks
        System.out.print("Please enter lab submission marks (out of 100): ");
        double labMarks = scanner.nextDouble();

        // Validate lab marks
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input for lab submission marks. Terminating program.");
            scanner.close();
            return;
        }

        // Input percentages
        System.out.print("Please enter the percentage given for the exam: ");
        double examPercentage = scanner.nextDouble();

        System.out.print("Please enter the percentage given for the lab submission: ");
        double labPercentage = scanner.nextDouble();

        // Validate percentages add up to 100
        if (examPercentage + labPercentage != 100) {
            System.out.println("The percentages must add up to 100. Terminating program.");
            scanner.close();
            return;
        }

        // Calculate final mark
        double finalMark = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);

        System.out.println("Final Exam Mark is : " + finalMark);

        scanner.close();
    }
}