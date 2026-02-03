public class SubarraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 9;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == target) {
                    System.out.println("Subarray found from index " + i + " to " + j);
                    return;
                }
            }
        }
        System.out.println("No subarray found");
    }
}
