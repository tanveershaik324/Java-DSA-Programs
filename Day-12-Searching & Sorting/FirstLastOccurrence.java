public class FirstLastOccurrence {

    public static int findFirst(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == key) {
                result = mid;
                right = mid - 1;
            } else if (arr[mid] < key)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return result;
    }

    public static int findLast(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == key) {
                result = mid;
                left = mid + 1;
            } else if (arr[mid] < key)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int key = 2;

        System.out.println("First Occurrence: " + findFirst(arr, key));
        System.out.println("Last Occurrence: " + findLast(arr, key));
    }
}
