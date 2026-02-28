import java.util.*;

public class StockSpan {
    public static void main(String[] args) {
        int price[] = {100, 80, 60, 70, 60, 75, 85};
        int span[] = new int[price.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < price.length; i++) {
            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
                stack.pop();
            }

            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            stack.push(i);
        }

        System.out.println("Stock Span:");
        for (int s : span)
            System.out.print(s + " ");
    }
}
