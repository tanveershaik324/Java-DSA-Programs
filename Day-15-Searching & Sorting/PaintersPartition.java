public class PaintersPartition {

    public static boolean isPossible(int[] boards, int k, int maxTime) {
        int painters = 1, currentSum = 0;

        for (int board : boards) {
            if (board > maxTime) return false;

            if (currentSum + board > maxTime) {
                painters++;
                currentSum = board;
                if (painters > k) return false;
            } else {
                currentSum += board;
            }
        }
        return true;
    }

    public static int minTime(int[] boards, int k) {
        int low = 0, high = 0, result = 0;

        for (int board : boards) {
            high += board;
            low = Math.max(low, board);
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(boards, k, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] boards = {10, 20, 30, 40};
        int k = 2;
        System.out.println("Minimum Time: " + minTime(boards, k));
    }
}
