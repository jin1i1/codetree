import java.util.Arrays;
import java.util.Scanner;

class Personal implements Comparable<Personal> {
    String name;
    int h, w;

    public Personal(String name, int h, int w) {
        this.name = name;
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Personal person) {
        if (this.h == person.h) {
            return person.w - this.w;
        }
        return this.h - person.h;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] name = new String[n];
        int[] height = new int[n];
        int[] weight = new int[n];

        Personal[] people = new Personal[n];

        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
            height[i] = sc.nextInt();
            weight[i] = sc.nextInt();

            people[i] = new Personal(name[i], height[i], weight[i]);

        }

        Arrays.sort(people);

        for (int i = 0; i < n; i++) {
            System.out.println(people[i].name + " " + people[i].h + " " + people[i].w);
        }
    }
}
