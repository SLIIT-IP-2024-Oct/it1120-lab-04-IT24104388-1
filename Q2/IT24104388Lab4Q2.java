import java.util.Scanner;

public class IT24104388Lab4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input and validate exam marks
        System.out.print("Please enter exam mark (out of 100): ");
        double examMark = scanner.nextDouble();
        if (examMark < 0 || examMark > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            scanner.close();
            return;
        }

        // Input and validate lab submission marks
        System.out.print("Please enter lab submission mark (out of 100): ");
        double labMark = scanner.nextDouble();
        if (labMark < 0 || labMark > 100) {
            System.out.println("Invalid input for lab submission marks. Terminating program.");
            scanner.close();
            return;
        }

        // Input and validate exam percentage
        System.out.print("Please enter the percentage given for the exam: ");
        double examPercentage = scanner.nextDouble();
        
        // Input and validate lab percentage
        System.out.print("Please enter the percentage given for the lab submission: ");
        double labPercentage = scanner.nextDouble();
        
        if (examPercentage + labPercentage != 100) {
            System.out.println("The percentages must add up to 100. Terminating program.");
            scanner.close();
            return;
        }

        // Calculate the final mark
        double finalMark = (examMark * examPercentage / 100) + (labMark * labPercentage / 100);

        // Display the final mark
        System.out.println("\nFinal Exam Mark is: " + finalMark);

        scanner.close();
    }
}
