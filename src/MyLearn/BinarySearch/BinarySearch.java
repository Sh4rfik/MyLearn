package MyLearn.BinarySearch;

import java.util.Arrays;


public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {1, 6, 9, 23, 0, 2, 6, 1, 54, 32};
        binarySearch(arr, 9);
        System.out.println(Arrays.binarySearch(arr, 23));
    }

    public static void binarySearch(int[] arr, int item) {

        int low = 0;
        int high = arr.length - 1;
        int mid;
        int needItem;

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        while (low <= high) {
            mid = (low + high) / 2;
            needItem = arr[mid];
            if (needItem == item) {
                System.out.println("Position of item = " + mid);
            }
            if (needItem > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
    }
}
