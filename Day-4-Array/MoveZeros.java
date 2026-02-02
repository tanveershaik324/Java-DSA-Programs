public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int index = 0;

        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }

        while (index < arr.length) {
            arr[index++] = 0;
        }

        System.out.print("Array after moving zeros: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
