import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";
        int num = 0;

        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            str = sc.next();
            if (str.equals("push")) {
                num = sc.nextInt();
                s.push(num);
            }
            else if (str.equals("pop")) {
                System.out.println(s.pop());
            }
            else if (str.equals("size")) {
                System.out.println(s.size());
            }
            else if (str.equals("empty")) {
                if (s.isEmpty()) {
                    System.out.println(1);
                }
                else {
                    System.out.println(0);
                }
            }
            else if (str.equals("top")) {
                System.out.println(s.peek());
            }
        }
    }
}
