import java.util.Scanner;
public class ArrayValue11 {
    public static void main(String[] args) {
        int[] finalScore = new int[10];
        Scanner input11 = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the final score " + i + ": ");
            finalScore[i] = input11.nextInt();
        }
        for (int i = 0; i < finalScore.length; i++) {
            if (finalScore[i] > 70 ) {
            System.out.println("Student " + i + " Passed!"); 
            } else {
                System.out.println("Student " + i + " Failed!");
            }
        }
    }
}