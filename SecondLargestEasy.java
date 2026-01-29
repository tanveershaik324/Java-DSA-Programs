import java.util.Arrays;

public class SecondLargestEasy {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};

        Arrays.sort(arr);   // sort the array

        int secondLargest = arr[arr.length - 2];

        System.out.println("Second largest element = " + secondLargest);
    }
}
