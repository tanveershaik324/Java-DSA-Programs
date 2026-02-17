import java.util.Arrays;

public class AggressiveCows {

    public static boolean canPlace(int[] stalls, int cows, int distance) {
        int count = 1;
        int lastPosition = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPosition >= distance) {
                count++;
                lastPosition = stalls[i];
            }
            if (count >= cows)
                return true;
        }
        return false;
    }

    public static int largestMinDistance(int[] stalls, int cows) {
        Arrays.sort(stalls);
        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];
        int result = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canPlace(stalls, cows, mid)) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] stalls = {1, 2, 4, 8, 9};
        int cows = 3;
        System.out.println("Largest Minimum Distance: " + largestMinDistance(stalls, cows));
    }
}
