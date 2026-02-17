public class AllocatePages {

    public static boolean isPossible(int[] pages, int students, int maxPages) {
        int studentCount = 1, currentSum = 0;

        for (int page : pages) {
            if (page > maxPages) return false;

            if (currentSum + page > maxPages) {
                studentCount++;
                currentSum = page;
                if (studentCount > students) return false;
            } else {
                currentSum += page;
            }
        }
        return true;
    }

    public static int findMinimumPages(int[] pages, int students) {
        int low = 0, high = 0, result = 0;

        for (int page : pages) {
            high += page;
            low = Math.max(low, page);
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(pages, students, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] pages = {12, 34, 67, 90};
        int students = 2;
        System.out.println("Minimum Pages: " + findMinimumPages(pages, students));
    }
}
