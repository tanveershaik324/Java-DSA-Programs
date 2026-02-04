import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine().trim();

        if (str.isEmpty()) {
            System.out.println("Word Count: 0");
        } else {
            String[] words = str.split("\\s+");
            System.out.println("Word Count: " + words.length);
        }

        sc.close();
    }
}
