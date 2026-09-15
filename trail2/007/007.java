import java.util.Scanner;
public class Main {
    static class OO7 {
    int t;
    String sc;
    char mp;

    public OO7(String sc, char mp, int t){
        this.sc = sc;
        this.mp = mp;
        this.t = t;
        }
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sCode = sc.next();
        char mPoint = sc.next().charAt(0);
        int time = sc.nextInt();
        
        OO7 tape1 = new OO7(sCode, mPoint, time);

        System.out.println("secret code : " + tape1.sc);
        System.out.println("meeting point : " + tape1.mp);
        System.out.println("time : " + tape1.t);
    }
}