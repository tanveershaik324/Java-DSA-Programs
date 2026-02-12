public class FloorAndCeil {

    public static void findFloorAndCeil(int[] arr, int target) {
        int floor = -1, ceil = -1;

        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                floor = ceil = arr[mid];
                break;
            }

            if (arr[mid] < target) {
                floor = arr[mid];
                low = mid + 1;
            } else {
                ceil = arr[mid];
                high = mid - 1;
            }
        }

        System.out.println("Floor: " + floor);
        System.out.println("Ceil: " + ceil);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 10, 12};
        int target = 5;
        findFloorAndCeil(arr, target);
    }
}
