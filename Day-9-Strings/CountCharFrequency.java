import java.util.HashMap;

public class CountCharFrequency {
    public static void main(String[] args) {
        String str = "programming";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : map.keySet()) {
            System.out.println(ch + " : " + map.get(ch));
        }
    }
}
