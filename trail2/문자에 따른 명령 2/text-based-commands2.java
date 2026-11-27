import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int x = 0;
        int y = 0;
        int dir = 0;

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        for (int i = 0; i < s.length(); i++) {
            char command = s.charAt(i);

            if (command == 'L') {
                dir = (dir + 3) % 4;
            } else if (command == 'R') {
                dir = (dir + 1) % 4;
            } else if (command == 'F') {
                x += dx[dir];
                y += dy[dir];
            }
        }
        System.out.println(x + " " + y);
    }
}