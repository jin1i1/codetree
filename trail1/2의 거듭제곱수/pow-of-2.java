import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = 0;
        int num = 1;

        while (num < n) {
            num *= 2;
            x++;
        }

        System.out.println(x);
    }
}