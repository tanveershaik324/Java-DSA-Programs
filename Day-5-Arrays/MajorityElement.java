public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 2, 3, 2, 2};

        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        System.out.println("Majority Element: " + candidate);
    }
}
