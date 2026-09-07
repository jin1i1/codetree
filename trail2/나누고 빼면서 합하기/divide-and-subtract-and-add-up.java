import java.util.Scanner;
import java.util.regex.Pattern;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int m = sc.nextInt();

    static int[] arr = new int[n + 1];
        
    static int sum = 0;

    public static void cal() {
        while (true) {
            sum += arr[m];
            
            if (m == 1) {
                break;
            }
            if (m % 2 == 0) {
                m /= 2;
            }
            else {
                m -= 1;
            }
        }
    }

    public static void main(String[] args) {

        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();

        cal();

        System.out.print(sum);
    }
}