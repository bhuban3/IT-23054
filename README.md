Q1
Java Program:
import java.util.Scanner;

public class ReverseArray {
    public static void reverse(float[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            float temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        float[] arr = new float[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextFloat();
        }

        System.out.println("Original Array:");
        for (float num : arr) {
            System.out.print(num + " ");
        }

        reverse(arr);

        System.out.println("\nReversed Array:");
        for (float num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

output:
Enter the number of elements: 5
Enter the elements:
5.8 2.6 9.0 3.4 7.1
Original Array:
5.8 2.6 9.0 3.4 7.1 
Reversed Array:
7.1 3.4 9.0 2.6 5.8
