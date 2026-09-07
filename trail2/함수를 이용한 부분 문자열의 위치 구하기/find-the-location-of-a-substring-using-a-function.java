import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static String text = sc.next();
    static String pattern = sc.next();

    public static boolean check(int start) {

        if (start + pattern.length() > text.length()) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            if (text.charAt(start + i) != pattern.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        for (int i = 0; i < text.length(); i++) {
            if (check(i)) {
                System.out.print(i);
                return;
            }
        }

        System.out.print(-1);
    }
}