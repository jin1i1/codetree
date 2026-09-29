import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);
        int b = (int)a;
        if(b == 122) {
            b = 97;
        }
        else {
            b++;
        }
        System.out.print((char)b);
    }
}