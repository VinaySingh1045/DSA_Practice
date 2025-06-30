package Arraysss;

public class MergeTwoSortedArrayss {
//    3 pointer techquie will be used here
    public static void main(String[] args) {
        int[] a = {2,3,5,6,8,10,20};
        int[] b = {1,2,3,5,6,7,14,45,89,99};

        int[] c = new int[a.length + b.length];

//        merge(a,b,c);
        merge1(a,b,c);

        for (int ele : c ){
            System.out.print(ele + " ");
        }

    }

    private static void merge1(int[] a, int[] b, int[] c) {
        int i = a.length - 1;
        int j = b.length - 1;
        int k = c.length - 1;

        while (i >= 0 && j >= 0) {
            if (a[i] > b[j]) {
                c[k--] = a[i--]; // i is updated
            } else {
                c[k--] = b[j--]; // j is updated
            }
        }
        while (i >= 0) {
            c[k--] = a[i--];
        }

        while (j >= 0) {
            c[k--] = b[j--];
        }

    }

    private static void merge(int[] a, int[] b, int[] c) {
        int i=0, j=0, k=0;
        while (i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k] = a[i];
                i++;
//                k++;
            }
            else{
                c[k] = b[j];
                j++;
//                k++;
            }
            k++;
        }
        // Copy remaining elements of a[]
        while (i < a.length) {
            c[k++] = a[i++]; // this is called post increment after putting increment the index, we can
            // also use this in upper.
        }

        // Copy remaining elements of b[]
        while (j < b.length) {
            c[k++] = b[j++];
        }
    }
//    HW -> {3,5,2,0,7} + {9,2,1} = {3,6,1,2,8}
}
