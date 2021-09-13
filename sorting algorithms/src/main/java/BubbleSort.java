public class BubbleSort {
    static void bubbleSort(int[] arr) {
        for (int i = arr.length; i > 0 ; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (arr[j] > arr[j + 1]) UsefulFunction.swap(arr, j, j + 1);
            }
        }
//        UsefulFunction.print(arr);
    }


    public static void main(String[] args) {
        int[] arr = {9, 3, 1, 4, 6, 8, 7, 5, 2};
        bubbleSort(arr);
    }
}
