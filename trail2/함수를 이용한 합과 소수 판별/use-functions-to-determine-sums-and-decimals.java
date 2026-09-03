import java.util.Scanner;
public class Main {
    public static boolean prime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean res(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        if (sum % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for (int i = a; i <= b; i++) {
            if (prime(i) == true && res(i) == true) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }

}