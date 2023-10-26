package recursion2;

public class Quicksort {
    public static void quickSort(int[] arr, int si, int ei) {
        if(si >= ei) {
            return;
        }
        // calling partition 
        int pp = partition(arr, si, ei);
        quickSort(arr, si, pp-1); // recursively calling first half
        quickSort(arr, pp + 1, ei); // recursively calling second half
    }

    // partition method
    public static int partition(int[] arr, int si, int ei) {
        // let pivot element be first element of array 
        int pivot = arr[si];
        int count = 0;
        for(int i = si; i <= ei; i++) {
            if(arr[i] <= pivot) {
                count++;
            }
        }

        // swap pivot element to its actual position 
        int pp = si + count -1;
        int temp = arr[si];
        arr[si] = arr[pp];
        arr[pp] = temp;

        // ensure that the elements which are less than or equal to pivot is in the
        // left side of pivot element and the element which are greater than pivot
        // is in the right side of pivot element
        int i = si, j = ei;
        while(i < pp && j > pp) {
            while(arr[i] <= pivot) {
                i++;
            }
            while(arr[j] > pivot) {
                j--;
            }
            if(i < j) {
                int tempSwap = arr[i];
                arr[i] = arr[j];
                arr[j] = tempSwap;
            }
            i++;
            j--;
        }
        return pp;
    }
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int n = arr.length;
        System.out.println("Before sorting: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // calling quickSort
        quickSort(arr, 0, n - 1);
        System.out.println("\nAfter sorting: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}
