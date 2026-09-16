import java.util.Scanner;
class product {
    String name;
    int code;

    public product(String name, int code) {
        this.name = name;
        this.code = code;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id2 = sc.next();
        int code2 = sc.nextInt();
        
        product p1 = new product("codetree", 50);
        product p2 = new product(id2, code2);

        System.out.println("product " + p1.code + " is " +p1.name);
        System.out.println("product " + p2.code + " is " + p2.name);
    }
}