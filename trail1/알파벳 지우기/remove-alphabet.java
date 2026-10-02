import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String astr = "";
        String bstr = "";

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);

            if (c >= '0' && c <= '9') {
                astr += c;
            }
            else {
                continue;
            }
        }

        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);

            if (c >= '0' && c <= '9') {
                bstr += c;
            }
            else {
                continue;
            }
        }

        int aInt = Integer.parseInt(astr);
        int bInt = Integer.parseInt(bstr);

        int res = aInt + bInt;

        System.out.print(res);
    }
}
