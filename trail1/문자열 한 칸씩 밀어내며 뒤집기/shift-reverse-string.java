import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder str = new StringBuilder(sc.next());
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int n = sc.nextInt();

            if (n == 1) {
                // 맨 앞 문자를 맨 뒤로
                char first = str.charAt(0);
                str.deleteCharAt(0);
                str.append(first);
            }

            else if (n == 2) {
                // 맨 뒤 문자를 맨 앞으로
                char last = str.charAt(str.length() - 1);
                str.deleteCharAt(str.length() - 1);
                str.insert(0, last);
            }

            else if (n == 3) {
                // 문자열 뒤집기
                str.reverse();
            }

            System.out.println(str);
        }
    }
}