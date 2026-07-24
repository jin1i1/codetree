import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ams = sc.nextInt();
        int aes = sc.nextInt();
        int bms = sc.nextInt();
        int bes = sc.nextInt();

        if (ams > bms && aes > bes) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}