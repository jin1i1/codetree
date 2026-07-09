import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int t = 0;
        t = a;
        a = b;
        b = t;
        System.out.print(a + " " + b);        
    }
}