import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];

        int OFFSET = 100;
        int[] arr = new int[201];

        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();

            for (int j = start[i]; j <= end[i]; j++) {
                arr[j] += 1;
            }
        }


        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            else {
                continue;
            }
        }
        
        System.out.print(max);
    }
}