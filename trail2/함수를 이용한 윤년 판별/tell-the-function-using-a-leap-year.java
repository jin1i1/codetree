import java.util.Scanner;

public class Main {

    public static boolean year(int n) {
        if (n % 400 == 0) {
            return true;
        }
        else if (n % 100 == 0) {
            return false;
        }
        else if (n % 4 == 0) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();

        System.out.println(year(y));
    }
}