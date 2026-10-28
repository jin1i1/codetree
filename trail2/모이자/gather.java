import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int[] sumArr = new int[n];

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int v = Math.abs(j - i);
                sumArr[i] += a[j] * v;
            }
        }

        int minVal = sumArr[0];
        for (int i = 1; i < n; i++) {
            if (minVal > sumArr[i]) {
                minVal = sumArr[i];
            }
        }
        System.out.print(minVal);

    }
}
