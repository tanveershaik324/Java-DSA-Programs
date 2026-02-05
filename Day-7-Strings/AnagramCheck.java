import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        char[] a1 = s1.toLowerCase().toCharArray();
        char[] a2 = s2.toLowerCase().toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        if (Arrays.equals(a1, a2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
