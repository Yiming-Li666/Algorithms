public class ShellSort {
    static void shellSort(int[] arr){
        int h = 1;
        while (h <= arr.length / 3) {
            h = h * 3 + 1;
        }
        for (int gap = h; gap > 0; gap = (gap - 1) / 3) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i; j > gap - 1 && arr[j - gap] > arr[j]; j -= gap) {
                    UsefulFunction.swap(arr, j, j - gap);
                }
            }
        }
//        UsefulFunction.print(arr);
    }
    public static void main(String[] args) {
        int[] arr = {9, 6, 11, 3, 5, 12, 8, 7, 10, 15, 14, 4, 1, 13, 2};
        shellSort(arr);
    }
}
