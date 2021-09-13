public class InsertionSort {
    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j - 1] > arr[j]; j--) {
                UsefulFunction.swap(arr, j - 1, j);
            }
        }
//        UsefulFunction.print(arr);
    }

    public static void main(String[] args) {
        int[] arr = {9, 3, 1, 4, 6, 8, 7, 5, 2};
        insertionSort(arr);
    }
}
