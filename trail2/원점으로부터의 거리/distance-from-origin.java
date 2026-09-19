import java.util.Arrays;
import java.util.Scanner;

class Point implements Comparable<Point> {
    int dis;
    int num;

    public Point(int dis, int num) {
        this.dis = dis;
        this.num = num;
    }

    @Override
    public int compareTo(Point point) {
        if (this.dis == point.dis) {
            return this.num - point.num;
        }

        return this.dis - point.dis;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] points = new int[n][2];
        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }
        
        Point[] spot = new Point[n];

        for (int i = 0; i < n; i++) {
            int dis = Math.abs(points[i][0]) + Math.abs(points[i][1]);

            spot[i] = new Point(dis, i+1);
        }

        Arrays.sort(spot);

        for (int i = 0; i < n; i++) {
            System.out.println(spot[i].num);
        }
    }
}