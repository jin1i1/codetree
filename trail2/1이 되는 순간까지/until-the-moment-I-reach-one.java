import java.util.Scanner;
public class Main {
    static int cnt = 0;

    public static void m1(int n) {
        if (n == 1) {
            return;
        }

        if (n % 2 == 0) {
            n /= 2;
        }
        else {
            n /= 3;
        }

        cnt++;
        m1(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        m1(n);
        System.out.print(cnt);
    }
}