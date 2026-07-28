import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;

        for(int i=1; i<=3; i++) {
            char a = sc.next().charAt(0);
            int at = sc.nextInt();
            if (a == 'Y' && at >= 37) {
                cnt ++;
            }
            else if (a == 'N' && at >= 37) {
                continue;
            }
            else if (a == 'Y' && at < 37) {
                continue;
            }
            else {
                continue;
            }
        }

        if (cnt >= 2) {
            System.out.println("E");
        }
        else {
            System.out.println("N");
        }

    }
}
