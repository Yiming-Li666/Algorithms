import java.util.Arrays;
import java.util.Random;

public class Check {
    static int[] generateRandomArr() {
        Random r = new Random();
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10000);
        }
        return arr;
    }

    static void check() {
        int[] arr = generateRandomArr();
        int[] arr2 = new int[arr.length];
        System.arraycopy(arr, 0 , arr2, 0, arr.length);
        Arrays.sort(arr);
//        SelectionSort.selectionSort(arr2);
//        BubbleSort.bubbleSort(arr2);
//        InsertionSort.insertionSort(arr2);
//        ShellSort.shellSort(arr2);
//        QuickSort.quickSort(arr2, 0, arr2.length - 1);
//        MergeSort.mergesort(arr2, 0, arr2.length - 1);
        CountingSort.countingSort(arr2);
        boolean ifCorrect = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr2[i]){
                ifCorrect = false;
                break;
            }
        }
        System.out.println(" ");
        System.out.println(ifCorrect ? "Right" : "Wrong");
    }

    public static void main(String[] args) {
        check();
    }
}
