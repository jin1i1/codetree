import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;
        double avg = 0;

        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            sum += a;
        }
        avg = (double)sum / n;

        System.out.printf("%d %.1f", sum, avg);
    }
}