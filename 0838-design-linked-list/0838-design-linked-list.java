class MyLinkedList {

    // Node definition
    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    private Node head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    // Get value at index
    public int get(int index) {
        if (index < 0 || index >= size) return -1;

        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }

    // Add at head
    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;
    }

    // Add at tail
    public void addAtTail(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = node;
        }
        size++;
    }

    // Add at index
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;

        if (index == 0) {
            addAtHead(val);
            return;
        }

        Node prev = head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }

        Node node = new Node(val);
        node.next = prev.next;
        prev.next = node;
        size++;
    }

    // Delete at index
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;

        if (index == 0) {
            head = head.next;
        } else {
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            prev.next = prev.next.next;
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */