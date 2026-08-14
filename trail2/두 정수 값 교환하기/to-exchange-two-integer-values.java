import java.util.Scanner;

public class Main {

    public static int[] swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        return new int[]{a, b};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] result = swap(n, m);

        n = result[0];
        m = result[1];

        System.out.println(n + " " + m);
    }
}