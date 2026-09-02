import java.util.Scanner;

public class Main {

    public static boolean add(int n, int m) { // 덧셈
        System.out.print(n + " + " + m + " = " + (n+m));
        return true;
    }

    public static boolean sub(int n, int m) { //뺄셈
        System.out.print(n + " - " + m + " = " + (n-m));
        return true;
    }

    public static boolean mul(int n, int m) { //곱셈
        System.out.print(n + " * " + m + " = " + (n*m));
        return true;
    }

    public static boolean div(int n, int m) { //나눗셈
        int res = n/m;
        System.out.print(n + " / " + m + " = " + (res));
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int o = sc.next().charAt(0);
        int c = sc.nextInt();

        if (o == '+') {
            add(a,c);
        }
        else if (o == '-') {
            sub(a,c);
        }
        else if (o == '*') {
            mul(a,c);
        }
        else if (o == '/') {
            div(a,c);
        }
        else {
            System.out.print("False");
        }

    }
}