import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        String ab = a+b;
        String ba = b+a;

        int abInt = Integer.parseInt(ab);
        int baInt = Integer.parseInt(ba);

        int res = abInt + baInt;

        System.out.print(res);
    }
}
