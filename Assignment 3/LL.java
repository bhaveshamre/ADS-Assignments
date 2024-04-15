import java.util.*;

class LL {
    Node head; // pointer head

    static class Node {
        int data;                                      // field
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    void Display() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data + " --> ");
            n = n.next;
        }
    }

    void Insert(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void append(int new_data) {
        Node new_node = new Node(new_data);

        if (head == null) {
            head = new_node;
            return;
        }

        new_node.next = null;
        Node n = head;

        while (n.next != null) {
            n = n.next;
        }

        n.next = new_node;
    }

    void insertAfter(Node prev_node, int new_data) {
        if (prev_node == null) {
            System.out.print("Empty List! ");
        }

        Node new_node = new Node(new_data);
        new_node.next = prev_node.next; // breaking the link
        prev_node.next = new_node;      // new node is assigned to prev_node link
    }

    void Delete(int key) {
        Node temp = head;
        Node prev = null;

        if (temp != null && temp.data == key) {
            head = temp.next; // head to next node
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null)
            return;

        prev.next = temp.next;
    }

    public static void main(String[] args) {
        LL a = new LL();
        a.head = new Node(9);
        a.Insert(10);
        a.Insert(20);
        a.Insert(30);
        a.Display();
    }
}
