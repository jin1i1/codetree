import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            int num = Integer.parseInt(str);
            sum += num;
        }

        String toStr = Integer.toString(sum);

        String res = "";

        for (int i = 1; i < toStr.length(); i++) {
            res += toStr.charAt(i);
        }

        res += toStr.charAt(0);

        System.out.print(res);
    }
}