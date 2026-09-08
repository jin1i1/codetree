import java.util.Scanner;
public class Main {
    public static void printNum(int n) {
        int cnt = 0;
        if(n == 0)
            return;
        
        for(int i = 0; i < n; i++)
            cnt++;
        System.out.print(cnt + " ");
        printNum(n - 1);
        cnt = 0;
        for(int i = 0; i < n; i++)
            cnt++;
        System.out.print(cnt + " ");
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNum(n);
    }
}