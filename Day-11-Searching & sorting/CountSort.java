import java.util.Scanner;

public class CountSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int[] count = new int[max + 1];

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                System.out.print(i + " ");
                count[i]--;
            }
        }
    }
}
