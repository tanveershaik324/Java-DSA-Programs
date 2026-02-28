import java.util.Stack;

public class SortStack {

    static void sortedInsert(Stack<Integer> st, int x) {
        if (st.isEmpty() || x > st.peek()) {
            st.push(x);
            return;
        }

        int temp = st.pop();
        sortedInsert(st, x);
        st.push(temp);
    }

    static void sort(Stack<Integer> st) {
        if (!st.isEmpty()) {
            int temp = st.pop();
            sort(st);
            sortedInsert(st, temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(30);
        st.push(10);
        st.push(20);

        sort(st);
        System.out.println(st);
    }
}
