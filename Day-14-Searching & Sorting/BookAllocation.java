public class BookAllocation {

    public static boolean canAllocate(int[] books, int students, int maxPages) {
        int studentCount = 1;
        int pages = 0;

        for (int book : books) {
            if (book > maxPages)
                return false;

            if (pages + book > maxPages) {
                studentCount++;
                pages = book;

                if (studentCount > students)
                    return false;
            } else {
                pages += book;
            }
        }
        return true;
    }

    public static int findMinimumPages(int[] books, int students) {
        int low = 0, high = 0;
        int result = -1;

        for (int book : books) {
            high += book;
            low = Math.max(low, book);
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canAllocate(books, students, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] books = {12, 34, 67, 90};
        int students = 2;
        System.out.println("Minimum Pages: " + findMinimumPages(books, students));
    }
}
