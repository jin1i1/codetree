import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = a+b;
        double y = a-b;
        double res = x/y;
        System.out.printf("%.2f", res);
    }
}