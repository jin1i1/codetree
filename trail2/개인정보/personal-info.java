import java.util.Scanner;
import java.util.Arrays;

class Personal implements Comparable<Personal> {
    String name;
    int h;
    double w;

    public Personal(String name, int h, double w) {
        this.name = name;
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Personal person) {
        return this.name.compareTo(person.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        String[] names = new String[n];
        int[] heights = new int[n];
        double[] weights = new double[n];

        Personal[] people = new Personal[n];

        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            heights[i] = sc.nextInt();
            weights[i] = sc.nextDouble();

            people[i] = new Personal(names[i], heights[i], weights[i]);
        }

        Arrays.sort(people);

        System.out.println("name");
        for (int i = 0; i < n; i++) {
            System.out.println(people[i].name + " " + people[i].h + " " + people[i].w);
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (people[i].h < people[j].h) {
                    Personal temp = people[i];
                    people[i] = people[j];
                    people[j] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("height");
        for (int i = 0; i < n; i++) {
            System.out.println(people[i].name + " " + people[i].h + " " + people[i].w);
        }
    }
}
