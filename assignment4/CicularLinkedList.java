class CircularLinkedList {
    private Node tail;

    private static class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }
    public CircularLinkedList(){
        tail = null;
    }

    public void addLast(int value) {
        Node newNode = new Node(value);
        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void addFirst(int value) {
        Node newNode = new Node(value);
        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
        }
    }

    public void addPosition(int pos, int value) {
        if (pos <= 0) return;
        Node newNode = new Node(value);
        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } else if (pos == 1) {
            newNode.next = tail.next;
            tail.next = newNode;
        } else {
            Node trav = tail.next;
            for (int i = 1; i < pos - 1 && trav != tail; i++) {
                trav = trav.next;
            }
            newNode.next = trav.next;
            trav.next = newNode;
            if (trav == tail) tail = newNode;
        }
    }

    public void deleteFirst() {
        if (tail == null) return;
        if (tail.next == tail) {
            tail = null;
        } else {
            tail.next = tail.next.next;
        }
    }

    public void deleteLast() {
        if (tail == null) return;
        if (tail.next == tail) {
            tail = null;
        } else {
            Node current = tail.next;
            while (current.next != tail) {
                current = current.next;
            }
            current.next = tail.next;
            tail = current;
        }
    }

    public void deletePosition(int pos) {
        if (pos <= 0 || tail == null) return;
        if (pos == 1) {
            if (tail.next == tail) {
                tail = null;
            } else {
                tail.next = tail.next.next;
            }
        } else {
            Node trav = tail.next;
            for (int i = 1; i < pos - 1 && trav.next != tail.next; i++) {
                trav = trav.next;
            }
            if (trav.next == tail) {
                trav.next = tail.next;
                tail = trav;
            } else if (trav.next != tail.next) {
                trav.next = trav.next.next;
            }
        }
    }

    

    public void display() {
        if (tail == null) return;
        Node trav = tail.next;
        do {
            System.out.print(trav.data + " ");
            trav = trav.next;
        } while (trav != tail.next);
        System.out.println();
    }
}
