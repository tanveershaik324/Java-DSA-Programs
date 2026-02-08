public class RemoveWhitespaces {
    public static void main(String[] args) {
        String str = "Java is easy";
        String result = str.replaceAll("\\s", "");
        System.out.println(result);
    }
}
