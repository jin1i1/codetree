import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        
        String[] arr = new String[n];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (words[i].indexOf(t) == 0) {
                arr[cnt] = words[i];
                cnt++;
            }
        }

        Arrays.sort(arr, 0, cnt);

        System.out.println(arr[k-1]);
    }
}