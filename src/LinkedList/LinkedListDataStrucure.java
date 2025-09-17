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

    void deleteAtHead() {
        if (head == null)
            throw new Error("List is Empty!");
        head = head.next;
        if (head == null)
            tail = null; // after next if head becomes null for 1 node.
        size--;
    }

    int Search(int val) {
        if (head == null)
            return -1;
        Node temp = head;
        int idx = 0;
        while (temp != null) {
            if (temp.val == val)
                return idx;
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    void insert(int idx, int val) {
        if (idx < 0 || idx > size)
            System.out.println("Invalid Index");
        else if (idx == size)
            addAtTail(val);
        else if (idx == 0)
            addAtHead(val);
        else {
            Node temp = head; // create the tempariry node to travel
            // for loop to travel to the idx where we have to insert
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            Node t = new Node(val); // Create new node to insert on the index.
            t.next = temp.next; // first humne naye node ko temp ke next node ke saath attach karna hai
            temp.next = t;// phir hum temp node ko new node ke saath attach karenge.
            size++;
        }
    }

    int get(int idx) {
        if (idx < 0 || idx >= size) {
            throw new IndexOutOfBoundsException("Invalid Index: " + idx);
        }
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void delete(int idx) {
        if (idx < 0 || idx >= size) {
            throw new IndexOutOfBoundsException("Invalid Index: " + idx);
        }
        else if(idx == 0) deleteAtHead();
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next; // here we are inserting in the temp.next.next in to temp.next that's why the ele skip and we called as delete.
        if(idx == size - 1) tail = temp; // we are deleting the tail;
        size--;
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
        // ll.deleteAtHead();
        // ll.Display();
        System.out.print(ll.size);
        ll.insert(2, 1045);
        ll.Display();
        System.out.println(ll.Search(20));
        System.out.println(ll.get(3));
        ll.delete(3);
        ll.Display();
    }
}
