import java.util.Scanner;

public class Main {

    public static int max(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }

        int maxNum = max(arr, n - 1);

        if (maxNum < arr[n - 1]) {
            maxNum = arr[n - 1];
        }

        return maxNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(max(arr, n));
    }
}