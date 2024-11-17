import java.util.Scanner;
public class Assignment11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int numberElements = input11.nextInt();
        int[] numbers = new int[numberElements];
        for (int i = 0; i < numberElements; i++) {
            System.out.print("Enter value of element " + (i + 1) + ": ");
            numbers[i] = input11.nextInt();
        }
        int highest = numbers[0];
        int lowest = numbers[0];
        int sum = 0;
        for (int number : numbers) {
            if (number > highest) {
                highest = number;
            }
            if (number < lowest) {
                lowest = number;
            }
            sum += number;
        }
        double average = (double) sum / numberElements;
        System.out.println("Highest value: " + highest);
        System.out.println("Lowest value: " + lowest);
        System.out.printf("Average value: %.2f%n", average);
        input11.close();
    }
}