import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        while (true) {
            n = sc.nextInt();
            if (n < 25) {
                System.out.println("Higher");
            }
            if (n > 25) {
                System.out.println("Lower");
            }
            if (n == 25) {
                System.out.println("Good");
                break;
            }
        }
    }
}
