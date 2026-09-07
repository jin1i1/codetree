import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int m = sc.nextInt();
    static int[] arr = new int[n];

    public static void main(String[] args) {

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int sum = 0;
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();

            for (int j = a1 - 1; j <a2; j++) {
                sum += arr[j];
            }
            System.out.println(sum);
        }
    }
}