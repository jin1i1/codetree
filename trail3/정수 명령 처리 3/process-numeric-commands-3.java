import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";
        int num = 0;
        
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            str = sc.next();

            if (str.equals("push_front")) {
                num = sc.nextInt();
                dq.addFirst(num);
            }
            else if (str.equals("push_back")) {
                num = sc.nextInt();
                dq.addLast(num);
            }
            else if (str.equals("pop_front")) {
                System.out.println(dq.pollFirst());
            }
            else if (str.equals("pop_back")) {
                System.out.println(dq.pollLast());
            }
            else if (str.equals("size")) {
                System.out.println(dq.size());
            }
            else if (str.equals("empty")) {
                if (dq.isEmpty()) {
                    System.out.println(1);
                }
                else {
                    System.out.println(0);
                }
            }
            else if (str.equals("front")) {
                System.out.println(dq.peekFirst());
            }
            else if (str.equals("back")) {
                System.out.println(dq.peekLast());
            }
        }
    }
}
