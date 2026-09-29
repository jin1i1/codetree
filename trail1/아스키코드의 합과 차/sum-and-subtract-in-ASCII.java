import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);

        int max = (int) a;
        int min = (int) b;

        if ((int)b > (int)a) {
            max = (int)b;
            min = (int)a;
        }

        System.out.print(((int)a + (int)b) + " " + (max - min));
    }
}