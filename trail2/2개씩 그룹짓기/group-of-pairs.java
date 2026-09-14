import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);
        int[] arr = new int[n];

        for (int i = 0; i<n; i++) {
            arr[i] = nums[i] + nums[2 * n - 1 - i];
        }

        int max = arr[0];
        for (int i = 1; i <n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.print(max);
    }
}