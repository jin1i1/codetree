import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a_ms = sc.nextInt();
        int a_es = sc.nextInt();
        int b_ms = sc.nextInt();
        int b_es = sc.nextInt();

        if (a_ms > b_ms) {
            System.out.println("A");
        }
        else if (a_ms < b_ms) {
            System.out.println("B");
        }
        else if (a_ms == b_ms){
            if (a_es > b_es) {
                System.out.println("A");
            }
            else {
                System.out.println("B");
            }
        }
    }
}
