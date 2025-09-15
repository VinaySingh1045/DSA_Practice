package OOPS;

class ArrayList { // we are creating our own arrayList this is called "user defiend
                  // arrayList(structure)"
    int arr[];
    int idx = 0;
    int size = 0; // how many elements are actually stored (filled slots)

    // here we create a array list.
    ArrayList(int capacity) {
        arr = new int[capacity];
    }

    int capacity() { // how many slots are available in the array (total storage)
        return arr.length;
    }

    // here we are going to add the value to our arraylist.
    // void add(int ele){
    // arr[idx] = ele;
    // idx++;
    // size++;
    // }

    // now if we add more than 3 as it is over capacity for this case so we got the
    // error index out of bound so what we do we will increase the size of the
    // capacity
    void add(int ele) {
        if (idx == arr.length) { // array is full then we call this function.
            increaseCapacity();
        }
        arr[idx] = ele;
        idx++;
        size++;
    }

    void increaseCapacity() {
        int arr2[] = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        arr = arr2;
    }

    // get the value by index
    int get(int index) {
        return arr[index];
    }

    // set the value to the index but in range(size)
    void set(int index, int ele) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for size " + size);
        }
        arr[index] = ele;
    }

    // remove the last element only.
    void removeFromEnd() {
        idx--;
        size--;
    }

    // remove any element from the given arr and shift the position.
    void remove(int index) {
        // complete it
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    void insert(int index, int ele) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for size " + size);
        }

        // Expand if needed
        if (size == arr.length) {
            increaseCapacity();
        }

        // Shift elements right
        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }

        // Insert element
        arr[index] = ele;
        size++;
    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

public class OwnArrayList {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(3);
        // System.out.println(al.capacity());
        al.add(10);
        al.add(45);
        al.add(99);
        al.print();
        al.add(17);
        al.add(18);
        al.print();
        System.out.println(al.get(1));
        al.set(3, 12);
        // al.set(5, 11);
        al.print();
        // al.removeFromEnd();
        // al.print();
        al.remove(2);
        al.print();
        al.insert(3, 200);
        al.print();
    }
}
