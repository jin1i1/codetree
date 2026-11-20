import java.io.SyncFailedException;
import java.util.Scanner;

public class Main {
    public static int res = 0;
    public static void DFS(int n, int vertax, int[][] graph, boolean[] visited) {
    
        for (int cV = 1; cV <= n; cV++) {
            int cnt = 0;
            if(graph[vertax][cV] == 1 && !visited[cV]) {
                res++;
                visited[cV] = true;
                DFS(n, cV, graph, visited);
            }
        }
        
    }   


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] u = new int[m];
        int[] v = new int[m];
        for (int i = 0; i < m; i++) {
            u[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        
        
        int[][] arr = new int[n+1][n+1];
        for (int i = 0; i < m; i++) {
            arr[u[i]][v[i]] = 1;
            arr[v[i]][u[i]] = 1;
        }

        boolean[] visited = new boolean[n+1];
        visited[1] = true;
        
        DFS(n, 1, arr, visited);
        System.out.println(res);
    }
}