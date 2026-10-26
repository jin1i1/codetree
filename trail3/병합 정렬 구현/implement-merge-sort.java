import java.util.Scanner;

public class Main {

    public static int[] merged_arr;

    public static void merge(int a[], int l, int m, int h) {
        int i = l;
        int j = m;
        int k = l;

        while (i < m && j <= h) {
            if (a[i] <= a[j]) {
                merged_arr[k] = a[i];
                i++;
            } else {
                merged_arr[k] = a[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            merged_arr[k] = a[i];
            i++;
            k++;
        }

        while (j <= h) {
            merged_arr[k] = a[j];
            j++;
            k++;
        }

        for (int x = l; x <= h; x++) {
            a[x] = merged_arr[x];
        }
    }

    public static void merge_sort(int arr[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            merge_sort(arr, low, mid);
            merge_sort(arr, mid + 1, high);

            merge(arr, low, mid + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        merged_arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        merge_sort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}