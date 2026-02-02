import java.util.HashMap;

public class TwoSumHashMap {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];

            if (map.containsKey(remaining)) {
                System.out.println("Indexes: " + map.get(remaining) + " and " + i);
                return;
            }

            map.put(nums[i], i);
        }

        System.out.println("No pair found");
    }
}
Two sum hashmap
