public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;

        System.out.print("Rotated Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
