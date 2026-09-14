import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i += 2) {

            int[] temp = new int[i + 1];

            for (int j = 0; j <= i; j++) {
                temp[j] = arr[j];
            }

            Arrays.sort(temp);

            System.out.print(temp[i / 2] + " ");
        }
    }
}