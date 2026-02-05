public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "programming";
        boolean[] visited = new boolean[256];
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (!visited[ch]) {
                visited[ch] = true;
                result.append(ch);
            }
        }

        System.out.println("After removing duplicates: " + result);
    }
}
