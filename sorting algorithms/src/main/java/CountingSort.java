public class CountingSort {
    static int[] countingSort(int[] arr) {
        int[] result = new int[arr.length];
        int[] count = new int[10];
        for (int j : arr) {
            count[j]++;
        }
//        for (int i = 0, j = 0; i < count.length; i++) {
//            while(count[i]-- > 0) result[j++] = i;
//        }
        // 下标数组
        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i - 1];
        }
        for (int i = arr.length - 1; i >= 0 ; i--) {
            result[--count[arr[i]]] = arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 2, 3, 7, 1, 1, 0, 0, 5, 6, 9, 8, 5, 7, 4, 0, 9};
        int[] result = countingSort(arr);
        UsefulFunction.print(result);
    }
}
