import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        int OFFSET = 100;
        int[][] arr = new int[201][201];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = x[i]; j < x[i] + 8; j++) {
                for (int k = y[i]; k < y[i] + 8; k++) {
                    arr[j + OFFSET][k + OFFSET]++;
                }
            }
        }

        int cnt = 0;

        for (int i = 0; i < 201; i++) {
            for (int j = 0; j < 201; j++) {
                if (arr[i][j] > 0) {
                    cnt++;
                }
            }
        }

        System.out.print(cnt);
    }
}