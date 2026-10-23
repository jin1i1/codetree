
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int pos = 1; pos <= 100000; pos *= 10) {

            int[][] bucket = new int[10][n];
            int[] count = new int[10];

            // 각 자릿수에 따라 숫자 분류
            for (int i = 0; i < n; i++) {
                int digit = (arr[i] / pos) % 10;

                bucket[digit][count[digit]] = arr[i];
                count[digit]++;
            }

            int index = 0;

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < count[i]; j++) {
                    arr[index] = bucket[i][j];
                    index++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
