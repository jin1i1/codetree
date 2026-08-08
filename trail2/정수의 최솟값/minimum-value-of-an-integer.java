import java.util.Scanner;

public class Main {
    public static void printRect(int n, int m, int x) {
        int min = n;

        if (m < min) {
            min = m;
        }

        if (x < min) {
            min = x;
        }

        System.out.println(min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        printRect(a, b, c);
    }
}
