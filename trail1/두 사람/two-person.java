import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a_a = sc.nextInt();
        char a_s =  sc.next().charAt(0);
        int b_a = sc.nextInt();
        char b_s =  sc.next().charAt(0);

        if ((a_a >= 19 && a_s == 'M') || (b_a >= 19 && b_s == 'M')) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}
