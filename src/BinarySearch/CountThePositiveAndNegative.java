package BinarySearch;

public class CountThePositiveAndNegative {
    public static void main(String[] args) {
        int[] arr = { -3, -2, -1, 0, 0, 1, 2 }; // You can change this input
        int result = maximumCount(arr);
        System.out.println("Maximum count of positive or negative numbers: " + result);
    }

    public static int maximumCount(int[] arr) {
        int n = arr.length;
        // Find the first index where number > 0
        int low = 0, high = n - 1, firstPositiveIndex = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > 0) {
                firstPositiveIndex = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        // Find the first index where number >= 0 (i.e., start of zeros and positives)
        low = 0;
        high = n - 1;
        int firstZeroOrPositiveIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= 0) {
                firstZeroOrPositiveIndex = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        int posCount = n - firstPositiveIndex; // here we will be get positive
        int negCount = firstZeroOrPositiveIndex; // here

        return Math.max(posCount, negCount);

    }
}
