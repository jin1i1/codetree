import java.util.Scanner;

public class Main {

    public static void printgcd(int n, int m) {
        int gcd = 1;
        int min;

        if (n < m) {
            min = n;
        } else {
            min = m;
        }

        for (int i = 1; i <= min; i++) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
            }
        }

        System.out.println(gcd);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        printgcd(n, m);
    }
}