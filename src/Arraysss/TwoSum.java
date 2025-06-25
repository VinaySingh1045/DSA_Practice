package Arraysss;

public class TwoSum {
    // koi doo element ko plus kar ke target element milega to vahi hoga twosum
    // eg: {10,20,30,40,3,2} --> target =50, so -> 10+40 = 50;
    public static void main(String[] args) {
       int arr[] = {1, 4, 45, 6, 10, 8};
       int target = 16;
        System.out.println(twoSum(arr, target));
    }
    public static boolean twoSum(int arr[], int target) {
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] + arr[j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
