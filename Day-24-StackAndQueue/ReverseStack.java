import java.util.Stack;

public class ReverseStack {

    static void insertAtBottom(Stack<Integer> st, int x) {
        if (st.isEmpty()) {
            st.push(x);
            return;
        }
        int temp = st.pop();
        insertAtBottom(st, x);
        st.push(temp);
    }

    static void reverse(Stack<Integer> st) {
        if (!st.isEmpty()) {
            int temp = st.pop();
            reverse(st);
            insertAtBottom(st, temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);

        reverse(st);
        System.out.println(st);
    }
}
