import java.util.Scanner;
import java.util.Arrays;

class Location implements Comparable<Location> {
    int num, idx;

    public Location(int num, int idx) {
        this.num = num;
        this.idx = idx;
    }

    @Override
    public int compareTo(Location location) {
        if (this.num == location.num) {
            return this.idx - location.idx;
        }

        return this.num - location.num;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        Location[] spot = new Location[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();

            spot[i] = new Location(arr[i], i+1);
        }
        
        Arrays.sort(spot);

        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[spot[i].idx - 1] = i + 1;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
