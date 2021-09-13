public class SelectionSort {

    static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++){
                minPos = arr[j] < arr[minPos] ? j : minPos;
            }
//            System.out.println("minPos: " + minPos);
            UsefulFunction.swap(arr, i, minPos);
        }
//        UsefulFunction.print(arr);
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 8, 1 ,7, 9, 4, 2};
        selectionSort(arr);
    }
}
