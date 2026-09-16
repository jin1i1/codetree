import java.util.Scanner;
class bomb {
    String code;
    char color;
    int sc;

    public bomb(String code, char color, int sc) {
        this.code = code;
        this.color = color;
        this.sc = sc;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uCode = sc.next();
        char lColor = sc.next().charAt(0);
        int time = sc.nextInt();
        
        bomb lock1 = new bomb(uCode, lColor, time);

        System.out.println("code : " + lock1.code);
        System.out.println("color : " + lock1.color);
        System.out.println("second : " + lock1.sc);
    }
}