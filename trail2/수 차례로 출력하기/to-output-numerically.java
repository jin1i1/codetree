import java.util.Scanner;
public class Main {

    public static void printNum1(int n) {
        if (n == 0) {
            return;
        }
        for (int i = 1; i <= n; i++) 
            System.out.print(i + " ");
    }

    public static void printNum2(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNum2(n -1);

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        printNum1(n);
        System.out.println();
        printNum2(n);
    }
}