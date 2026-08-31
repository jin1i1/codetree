import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // 위쪽 + 가운데
        for (int i = 1; i <= N; i++) {

            // 앞쪽 공백
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }

            // 별
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // 아래쪽
        for (int i = N - 1; i >= 1; i--) {

            // 앞쪽 공백
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }

            // 별
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}