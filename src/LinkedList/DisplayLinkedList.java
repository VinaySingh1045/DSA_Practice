package LinkedList;

class Node {
    int val;
    Node next; // Default value "null"

    Node(int val) {
        this.val = val;
    }
}

public class DisplayLinkedList {

    public static void displayRec(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.val + " ");
        displayRec(head.next);
    }

    public static void Display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();

        // for (Node temp = head; temp !=null; temp = temp.next) {
        // System.err.print(temp.val+ " ");
        // }
        // System.out.println();
    }

    public static int get(Node head, int idx) {
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        // Display(n1);
        displayRec(n1);
        System.out.println();
        System.out.println(get(n1, 2));
    }
}
