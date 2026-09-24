import java.util.Scanner;

public class Main {
    public static char[] d = new char[1000];
    public static int[] t = new int[1000];
    public static char[] d2 = new char[1000];
    public static int[] t2 = new int[1000];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            d[i] = sc.next().charAt(0);
            t[i] = sc.nextInt();
            cnt += t[i];
        }

        for (int i = 0; i < m; i++) {
            d2[i] = sc.next().charAt(0);
            t2[i] = sc.nextInt();
        }

        int[] arr1 = new int[cnt + 1];
        int[] arr2 = new int[cnt + 1];

        int time = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < t[i]; j++) {
                time++;

                if (d[i] == 'R') {
                    arr1[time] = arr1[time - 1] + 1;
                }
                else {
                    arr1[time] = arr1[time - 1] - 1;
                }
            }
        }

        time = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < t2[i]; j++) {
                time++;

                if (d2[i] == 'R') {
                    arr2[time] = arr2[time - 1] + 1;
                }
                else {
                    arr2[time] = arr2[time - 1] - 1;
                }
            }
        }

        int res = -1;

        for (int i = 1; i <= cnt; i++) {
            if (arr1[i] == arr2[i]) {
                res = i;
                break;
            }
        }

        System.out.print(res);
        
    }
}