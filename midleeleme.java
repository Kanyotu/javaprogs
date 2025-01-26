import java.util.Scanner;

public class mideleme {
    public static int mid(int[] x) {
        int left = 0;
        int right = x.length - 1;
        while (left != right) {
            left++;
            right--;
            if (left > right) {
                left = right;

            }
        }
        return x[left];
    }

    public static void main(String[] args) {
        Scanner ax = new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int n = ax.nextInt();
        int[] x = new int[n];
        if (n == 0) {
            System.out.println("array is empty");

        }
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element at index " + i + ": ");
            x[i] = ax.nextInt();
            System.out.println("\n");
        }
        System.out.println("the middle element of the array is: " + mid(x));
    }
}
