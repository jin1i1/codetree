import java.util.Scanner;

public class Main {

    public static int oe(int n) {
        if (n == 1) {
            return 0;
        }

        if (n % 2 == 0) {
            return oe(n / 2) + 1;
        }
        else {
            return oe(n * 3 + 1) + 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(oe(n));
    }
}