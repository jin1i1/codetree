import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        //1
        if (a >= b) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
        //2
        if (a > b) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
        //3
        if (b >= a) {
            System.out.println(1);
        }
        else {
            System.out. println(0);
        }
        //4
        if (b > a) {
            System.out.println(1);
        }
        else {
            System.out. println(0);
        }
        //5
        if (a == b) {
            System.out.println(1);
        }
        else {
            System.out. println(0);
        }
        //6
        if (a != b) {
            System.out.println(1);
        }
        else {
            System.out. println(0);
        }
    }
}