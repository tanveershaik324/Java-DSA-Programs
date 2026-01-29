public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 5};

        int max = arr[0];   // assume first element is max

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Max element = " + max);
    }
}
