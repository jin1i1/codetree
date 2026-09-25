import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] penalizedPerson = new int[m];
        for (int i = 0; i < m; i++) {
            penalizedPerson[i] = sc.nextInt();
        }

        int[] cnt = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int student = penalizedPerson[i];

            cnt[student]++;

            if (cnt[student] >= k) {
                System.out.print(student);
                return;
            }
        }

        System.out.print(-1);
    }
}