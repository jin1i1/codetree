import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String[] strArr = s.split(":");

        int h = Integer.parseInt(strArr[0]);
        int m = Integer.parseInt(strArr[1]);

        h++;

        if (h == 24) {
            h = 0;
        }

        System.out.println(h + ":" + m);
    }
}