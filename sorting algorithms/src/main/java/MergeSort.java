public class MergeSort {
    static void mergesort(int[] arr, int left, int right) {
        // base case
        if (left == right) return;

        int mid = left + (right - left) / 2;
        // sort left
        mergesort(arr, left, mid);
        // sort right
        mergesort(arr,mid + 1, right);
        // merge
        merge(arr, left, mid + 1, right);
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int leftPtr = left;
        int rightPtr = mid;
        int k = 0;
        // merge two sorted array
        while (leftPtr <= mid - 1 && rightPtr <= right) {
            temp[k++] = arr[leftPtr] <= arr[rightPtr] ? arr[leftPtr++] : arr[rightPtr++];
        }
        // remaining items
        while (leftPtr <= mid - 1) temp[k++] = arr[leftPtr++];
        while (rightPtr <= right) temp[k++] = arr[rightPtr++];
        // copy sorted array to original array
        for (int i = 0; i < temp.length; i++) arr[left + i] = temp[i];
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 8, 1, 7, 9, 4, 2};
        mergesort(arr, 0, arr.length - 1);
        UsefulFunction.print(arr);
    }
}
