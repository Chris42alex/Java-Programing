import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch;

        do {
            System.out.println("Choose an operation:");
            System.out.println("1: Arithmetic Operation");
            System.out.println("2: Array Access");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter numerator: ");
                        int numerator = scanner.nextInt();
                        System.out.print("Enter denominator: ");
                        int denominator = scanner.nextInt();
                        int result = numerator / denominator;
                        System.out.println("Result: " + result);
                    } catch (ArithmeticException e) {
                        System.out.println("Caught an exception: " + e.getMessage());
                    }
                    break;

                case 2:
                    int[] numbers = {1, 2, 3};
                    try {
                        System.out.print("Enter array index to access: ");
                        int index = scanner.nextInt();
                        System.out.println("Element at index " + index + ": " + numbers[index]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Caught an exception: " + e.getMessage());
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1 or 2.");
                    break;
            }

            System.out.print("Do you want to perform another operation? (y/n): ");
            ch = scanner.next().charAt(0);

        } while (ch == 'y' || ch == 'Y');

        scanner.close();
    }
}
