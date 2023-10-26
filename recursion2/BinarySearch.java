package recursion2;

public class BinarySearch {

    public static int binarySearch(int[] arr, int si, int ei, int target) {
        if(si > ei) {
            return -1;
        }
        int midIndex = (si + ei) / 2;
        if(arr[midIndex] == target) {
            return midIndex;
        } else if(arr[midIndex] < target) {
            return binarySearch(arr, midIndex + 1, ei, target);
        } else {
            return binarySearch(arr, si, midIndex - 1, target);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7};
        System.out.println(binarySearch(arr, 0, arr.length - 1, 4));        
    }
    
}
