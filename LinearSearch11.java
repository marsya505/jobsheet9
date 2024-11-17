import java.util.Scanner;
public class LinearSearch11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        System.out.print("Enter the number of array elements: ");
        int numberArrayElements = input11.nextInt();
        int[] arrayInt = new int[numberArrayElements];

        for (int i = 0; i < numberArrayElements; i++) {
        System.out.print("Enter the array elements " + i + ": ");
        arrayInt[i] = input11.nextInt(); 
        }
        System.out.print("Enter the key you want to search for: ");
        int key = input11.nextInt();
        int result = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                result = i;
                break;
            }
        }
        System.out.println("The key in the array is located at index position " + result);
    }
}