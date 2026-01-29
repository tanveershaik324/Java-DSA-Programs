import java.util.Arrays;

public class ReverseArrayRecursion {

    public static void reverse(int[] arr, int start, int end) {
        if (start >= end) return;

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverse(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original array: " + Arrays.toString(arr));

        reverse(arr, 0, arr.length - 1);

        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}
