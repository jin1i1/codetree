import java.util.Scanner;
import java.util.Arrays;

class location {
    String name, add, region;

    public location(String name, String add, String region) {
        this.name = name;
        this.add = add;
        this.region = region;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        location[] people = new location[n];
        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String add = sc.next();
            String region = sc.next();

            people[i] = new location(name, add, region);
            names[i] = name;
        }

        Arrays.sort(names);

        String lastName = names[n - 1];

        for (int i = 0; i < n; i++) {
            if (people[i].name.equals(lastName)) {
                System.out.println("name " + people[i].name);
                System.out.println("addr " + people[i].add);
                System.out.println("city " + people[i].region);
            }
        }
    }
}