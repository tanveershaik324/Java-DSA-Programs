class QueueArray {
    int arr[], front, rear, size, capacity;

    QueueArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    void enqueue(int x) {
        if (size == capacity) {
            System.out.println("Queue Full");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
    }

    void dequeue() {
        if (size == 0) {
            System.out.println("Queue Empty");
            return;
        }
        System.out.println("Removed: " + arr[front]);
        front = (front + 1) % capacity;
        size--;
    }

    void display() {
        if (size == 0) {
            System.out.println("Empty");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
    }
}
