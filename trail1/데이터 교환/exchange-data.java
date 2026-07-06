public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;
        int temp1 = 0;
        int temp2 = 0;
        temp1 = c;
        temp2 = b;
        b = a;
        c = temp2;
        a = temp1;
        System.out.println(a);
        System.out.println(b);
        System.out.print(c);
    }
}