import java.util.Stack;

public class PostfixEvaluation {

    static int evaluate(String exp) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            // If operand (digit)
            if (Character.isDigit(ch)) {
                st.push(ch - '0');
            }
            // If operator
            else {
                int val2 = st.pop();
                int val1 = st.pop();

                switch (ch) {
                    case '+':
                        st.push(val1 + val2);
                        break;
                    case '-':
                        st.push(val1 - val2);
                        break;
                    case '*':
                        st.push(val1 * val2);
                        break;
                    case '/':
                        st.push(val1 / val2);
                        break;
                }
            }
        }

        return st.pop();
    }

    public static void main(String[] args) {
        String exp = "23*54*+9-";

        System.out.println("Result: " + evaluate(exp));
    }
}
