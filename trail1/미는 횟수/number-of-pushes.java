import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int answer = -1;

        for (int i = 0; i < a.length(); i++) {
            if (a.equals(b)) {
                answer = i;
                break;
            }

            String res = "";
            res += a.charAt(a.length() - 1);

            for (int j = 0; j < a.length() - 1; j++) {
                res += a.charAt(j);
            }

            a = res;
        }

        System.out.print(answer);
    }
}