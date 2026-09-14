import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        
        char[] chars1 = word1.toCharArray();
        Arrays.sort(chars1);
        char[] chars2 = word2.toCharArray();
        Arrays.sort(chars2);

        int cnt = 0;

        if (chars1.length == chars2.length) {
            for(int i = 0; i < chars1.length; i++) {
                if(chars1[i] == chars2[i]) {
                    cnt++;
                }
            }
            if (cnt == chars1.length) {
                System.out.print("Yes");
            }
            else {
                System.out.print("No");
            }
        }
        else {
            System.out.print("No");
        }

    }
}