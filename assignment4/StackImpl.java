class StackImpl {
    private Node top;

    private static class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
        }
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        
        int value = top.data;
        top = top.next;
        return value;
    }

    public int peek() {
        
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        Node trav = top;
        while (trav != null) {
            System.out.print(trav.data + " ");
            trav = trav.next;
        }
        System.out.println();
    }
}


