import java.util.*;

class Permutations {
    static void permute(int[] nums, List<Integer> current, boolean[] used) {
        if (current.size() == nums.length) {
            System.out.println(current);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;

            used[i] = true;
            current.add(nums[i]);

            permute(nums, current, used);

            current.remove(current.size() - 1);
            used[i] = false; // backtrack
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        permute(nums, new ArrayList<>(), new boolean[nums.length]);
    }
}
