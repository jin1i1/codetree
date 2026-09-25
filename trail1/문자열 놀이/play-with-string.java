import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int q = sc.nextInt();

        char[] arr = s.toCharArray();

        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();

            if (type == 1) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                char temp = arr[a - 1];
                arr[a - 1] = arr[b - 1];
                arr[b - 1] = temp;
            }

            else if (type == 2) {
                char x = sc.next().charAt(0);
                char y = sc.next().charAt(0);

                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == x) {
                        arr[j] = y;
                    }
                }
            }

            System.out.println(new String(arr));
        }
    }
}