import java.util.ArrayDeque;

class DequeExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(10);
        dq.addLast(20);
        dq.addFirst(5);

        System.out.println("Deque: " + dq);

        dq.removeFirst();
        dq.removeLast();

        System.out.println("After removal: " + dq);
    }
}
