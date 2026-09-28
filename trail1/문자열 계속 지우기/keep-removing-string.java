import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        while (A.indexOf(B) != -1) {
            int idx = A.indexOf(B);

            A = A.substring(0, idx)
              + A.substring(idx + B.length());
        }

        System.out.print(A);
    }
}