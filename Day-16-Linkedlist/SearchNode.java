class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class SearchNode {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        SearchNode list = new SearchNode();
        list.insert(10);
        list.insert(20);
        list.insert(30);

        int key = 20;
        if (list.search(key)) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}
