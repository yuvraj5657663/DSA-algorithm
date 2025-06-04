package shorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 1, 7, 3, 7, 7, 9, 8, 9, 9, 0, 1, 8, 6, 2, 5, 4, 2, 3 };

        System.out.println("before sorting");
        printArray(arr);

        insertionSort(arr);
        System.out.println("after Sorting");
        printArray(arr);
    }

    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }
    static void printArray(int[] arr){
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
