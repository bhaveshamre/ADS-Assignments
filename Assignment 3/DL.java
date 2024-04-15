import java.lang.*;

class DL {
    Node head;

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int d) {
            this.data = d;
            this.next = null;
            this.prev = null;
        }
    }

    void Display() {
        Node n = head;
        Node p = null;
        System.out.println("Forward  ");
        while (n != null) {
            System.out.println(n.data + " ");
            p = n;
            n = n.next;
        }
        System.out.println("  ");

        System.out.println("Backward  ");
        while (p != null) {
            System.out.println(p.data + " ");
            p = p.prev;
        }
    }

    void Insert(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        new_node.prev = null;
        if (head != null) {
            head.prev = new_node;
            head = new_node;
        }
    }

    void append(int new_data) {
        Node new_node = new Node(new_data);

        Node last = head;
        new_node.next = null;

        if (head == null) {
            new_node.prev = null;
            head = new_node;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = new_node;
        new_node.prev = last;
    }

    void insertAfter(Node prev_node, int new_data) {
        if (prev_node == null) {
            System.out.println("Previous node does not exist");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
        new_node.prev = prev_node;
        if (new_node.next != null)
            new_node.next.prev = new_node;
    }

    void deleteNode(Node n) {
        if (head == null || n == null) {
            return;
        }

        if (head == n) {
            head = n.next;
        }

        if (n.next != null)
            n.next.prev = n.prev;
        if (n.prev != null)
            n.prev.next = n.next;

        return;
    }

    public static void main(String[] args) {
        DL a = new DL();
        a.Insert(10);
a.Insert(50);
a.Insert(20);
a.Insert(80);


        a.Display();
    }
}





























