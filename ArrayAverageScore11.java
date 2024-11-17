import java.util.Scanner;
public class ArrayAverageScore11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberofStudent = input11.nextInt();
        int[] score = new int[numberofStudent];
        int totalPassed = 0;
        int totalFailed = 0;
        int passed = 0;
        int failed = 0;
        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter the final score " + i + ": ");
            score[i] = input11.nextInt();
                if (score[i] > 70) {
                totalPassed += score[i];
                passed++;
                } else {
                totalFailed += score[i];
                failed++;
                }
    }
    double averagePassing = passed > 0 ? (double) totalPassed / passed : 0.0;
    double averageFailing = failed > 0 ? (double) totalFailed / failed : 0.0;
    System.out.println("The average score of students who passed is: " + averagePassing);
    System.out.println("The average score of students who failed is: " + averageFailing);
    }
}