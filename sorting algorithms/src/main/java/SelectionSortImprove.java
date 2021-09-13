public class SelectionSortImprove {
    static void selectionSortImprove(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int minPos = i;
            int maxPos = i;
            for (int j = i + 1; j < arr.length - i; j++) {
                minPos = arr[j] < arr[minPos] ? j : minPos;
                maxPos = arr[j] > arr[maxPos] ? j : maxPos;
            }
//            System.out.println("minPos: " + minPos);
//            System.out.println("maxPos: " + maxPos);
            UsefulFunction.swap(arr, i, minPos);
            UsefulFunction.swap(arr, arr.length - i - 1, maxPos);
        }
        System.out.print("Sorted: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }



    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 8, 1 ,7, 9, 4, 2};
        selectionSortImprove(arr);
    }
}
