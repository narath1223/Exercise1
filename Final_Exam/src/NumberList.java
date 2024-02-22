import java.util.Scanner;

public class NumberList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];

        System.out.println("Enter the numbers:");

        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Input Numbers:");

        for (int i = 0; i < count; i++) {
            System.out.println(numbers[i]);
        }
    }
}