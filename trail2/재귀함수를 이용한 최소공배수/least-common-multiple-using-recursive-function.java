import java.util.Scanner;

public class Main {

    public static int lcm(int a, int b) {
        int num = a;

        while (true) {
            if (num % a == 0 && num % b == 0) {
                return num;
            }

            num++;
        }
    }

    public static int cal(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }

        int result = cal(arr, n - 1);

        return lcm(result, arr[n - 1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        
        System.out.print(cal(arr, n));
    }
}