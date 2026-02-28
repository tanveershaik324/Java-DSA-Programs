public class PalindromeList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    boolean isPalindrome() {
        Node slow = head, fast = head;
        Node prev = null, next = null;

        // Reverse first half
        while (fast != null && fast.next != null) {
            fast = fast.next.next;

            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        // Skip middle element
        if (fast != null) {
            slow = slow.next;
        }

        // Compare both halves
        while (slow != null && prev != null) {
            if (slow.data != prev.data) {
                return false;
            }
            slow = slow.next;
            prev = prev.next;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeList list = new PalindromeList();

        list.head = list.new Node(1);
        list.head.next = list.new Node(2);
        list.head.next.next = list.new Node(2);
        list.head.next.next.next = list.new Node(1);

        System.out.println("Is Palindrome: " + list.isPalindrome());
    }
}
