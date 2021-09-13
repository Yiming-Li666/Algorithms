import java.lang.reflect.Array;
import java.util.Arrays;

public class RadixSort {
    static int[] radixSort(int[] arr) {
        int[] result = new int[arr.length];
        int[] count = new int[10];

        // 求最高位数
        int highest = 3;
        for (int i = 0; i < highest; i++) {
            // 10 to the power of i
            int division = (int)Math.pow(10, i);
            for (int j = 0; j < arr.length; j++) {
                int num = arr[j]/division % 10;
                count[num]++;
            }
            for (int m = 1; m < count.length; m++) {
                count[m] = count[m] + count[m - 1];
            }
//            UsefulFunction.print(count);
            for (int n = arr.length - 1; n >= 0; n--) {
                int num = arr[n]/division % 10;
                result[--count[num]] = arr[n];
            }
            System.arraycopy(result, 0, arr, 0, arr.length);
            Arrays.fill(count,0);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {422, 240, 115, 532, 305, 430, 124};
        int[] result = radixSort(arr);
        UsefulFunction.print(result);
    }
}
