import java.util.Scanner;

public class Main {

    public static boolean text(String s) {

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(0) != s.charAt(i)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        if (text(A)) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }
}