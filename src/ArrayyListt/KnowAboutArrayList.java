package ArrayyListt;

import java.util.ArrayList;
import java.util.Collections;

public class KnowAboutArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(45);
        arr.add(25);
        arr.add(18);
        arr.add(99);
        arr.add(07);

        System.out.println(arr.get(0));

        // update ke liye aise likhte hai nichh dekho
        arr.set(1,17); // hum array me aise karte the --> arr[1] = 17;

        // print hum direct kar sakhte hai bina loop ko iterate kiye agar karna hai to vo bhi poosible hai
        System.out.print(arr + " ");

        // is array ki length ke liye hum length nahi likhenge size likhenge
        int n = arr.size();
        System.out.println(); // just give for t5he next line.
//        for (int i = 0; i <n; i++) {
//            System.out.print(arr.get(i) + " ");
//        }

        // reverse bhi kar sakhte hai collection ka use kar ke

//        Collections.reverse(arr);
//        System.out.println(arr);

//        Or

        int i =0, j = arr.size() -1;

        while (i<j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
//        System.out.println(arr);
        System.out.print("Reverse: ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
