import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int OFFSET = 1000;
        int[] arr = new int[2001];

        int cur = OFFSET;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);

            if (dir == 'R') {
                for (int j = cur; j < cur + x; j++) {
                    arr[j] += 1;
                }
                cur += x;
            }

            else if (dir == 'L') {
                for (int j = cur - 1; j >= cur - x; j--) {
                    arr[j] += 1;
                }
                cur -= x;
            }
        }

        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 2) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}