public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "swiss";
        int[] freq = new int[256];

        for (char ch : str.toCharArray()) {
            freq[ch]++;
        }

        for (char ch : str.toCharArray()) {
            if (freq[ch] == 1) {
                System.out.println("First non-repeating character: " + ch);
                return;
            }
        }

        System.out.println("No non-repeating character found");
    }
}
