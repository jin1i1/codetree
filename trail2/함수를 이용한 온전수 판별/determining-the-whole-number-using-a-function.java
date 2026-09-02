import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        int cnt = 0;

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                continue;
            }
            else if (i % 10 == 5) {
                continue;
            }
            else if (i % 3 == 0 && i % 9 != 0) {
                continue;
            }
            else {
                cnt++;
            }
        }
        System.out.print(cnt);

    }
}