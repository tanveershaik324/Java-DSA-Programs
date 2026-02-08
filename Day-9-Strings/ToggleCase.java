public class ToggleCase {
    public static void main(String[] args) {
        String str = "HeLLo WoRLd";
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch);
            }
        }

        System.out.println("Toggled String: " + result);
    }
}
