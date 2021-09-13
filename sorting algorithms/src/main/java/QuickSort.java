public class QuickSort {
    static void quickSort(int[] arr, int leftBound, int rightBound) {
        if (leftBound >= rightBound) return;
        int mid = partition(arr, leftBound, rightBound);
        quickSort(arr, leftBound, mid - 1);
        quickSort(arr, mid + 1, rightBound);
        // merge
    }
    static int partition(int[] arr, int leftBound, int rightBound) {
        int pivot = arr[rightBound];
        int left = leftBound;
        int right = rightBound - 1;
        while (left <= right) {
            while (left <= right && arr[left] <= pivot) left++;
            while (left <= right && arr[right] > pivot) right--;
            if (left < right) UsefulFunction.swap(arr, left, right);
        }
        UsefulFunction.swap(arr, left, rightBound);
        return left;
    }
    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 8, 1, 9, 5, 4, 6};
        quickSort(arr, 0, arr.length - 1);

        UsefulFunction.print(arr);
    }
}
