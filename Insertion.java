import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize an array
        int[] arr = new int[6]; // Array size increased to accommodate new element
        int n = 5; // Initial number of elements

        // Fill the array with some values
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Get element and position from the user
        System.out.print("Enter element to insert: ");
        int element = scanner.nextInt();

        System.out.print("Enter position (0 to " + n + "): ");
        int position = scanner.nextInt();

        // Shift elements to the right
        for (int i = n; i > position; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert the new element
        arr[position] = element;

        // Print the updated array
        System.out.println("Array after insertion:");
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
