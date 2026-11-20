import java.time.temporal.ValueRange;
import java.util.Scanner;

public class Main {
    public static int n, m;

    public static int[][] grid = new int[0][0];
    public static boolean[][] visited = new boolean[0][0];


    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < m;
    }

    public static boolean canGo(int x, int y) {
        if(!inRange(x,y)) {
            return false;
        }
        if (visited[x][y] == true || grid[x][y] == 0) {
            return false;
        }
        return true;
    }

    public static void DFS(int x, int y) {
        int[] dx = new int[]{1,0};
        int[] dy = new int[]{0,1};

        
        visited[x][y] = true;

        for (int i = 0; i<2; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if(canGo(newX, newY)) {
                DFS(newX, newY);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();

        if (grid[0][0] == 1) {
            DFS(0,0); 
        }


        if (visited[n-1][m-1]) {
            System.out.print(1);
        }
        else {
            System.out.print(0);
        }
               
    }
}