import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();

        int num = 0;

        for (int i = 0; i < N.length(); i++) {
            num = num * A + (N.charAt(i) - '0');
        }

        int[] digits = new int[20];
        int cnt = 0;

        if (num == 0) {
            System.out.print(0);
            return;
        }

        while (num > 0) {
            digits[cnt++] = num % B;
            num /= B;
        }

        for (int i = cnt - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
    }
}