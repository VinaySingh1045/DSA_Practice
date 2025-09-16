package LinkedList;

class Node { // user Define Data Type.
    int val;
    Node next; // Default value "null"

    Node(int val) {
        this.val = val;
    }

}

class LinkedLList { // User Define Data Strucure
    Node head;
    Node tail;
    int size;

    void addAtTail(int val) {
        Node temp = new Node(val);
        if (tail == null)
            head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void addAtHead(int val) {
        Node temp = new Node(val);
        if (tail == null)
            head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void deleteAtHead(){
        if(head == null) throw new Error("List is Empty!");
        head = head.next;
        if(head == null) tail = null; // after next if head becomes null for 1 node.
        size--;
    }
    
    void Display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }


}

public class LinkedListDataStrucure {
    public static void main(String[] args) {
        LinkedLList ll = new LinkedLList();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.addAtTail(50);
        ll.addAtHead(60);
        ll.Display();
        ll.deleteAtHead();
        ll.Display();
        System.out.print(ll.size);
    }
}
