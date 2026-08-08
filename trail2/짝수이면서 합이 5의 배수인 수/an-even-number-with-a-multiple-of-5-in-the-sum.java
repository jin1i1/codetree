import java.util.Scanner;

public class Main {

    public static String check(int n) {
        int a = n / 10;  // 십의 자리
        int b = n % 10;  // 일의 자리

        if (n % 2 == 0 && (a + b) % 5 == 0) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(check(n));
    }
}