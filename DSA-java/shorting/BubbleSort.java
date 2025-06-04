package shorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 3,2,4,1,5,6,4,3,2,4,5,6,7,8,9,2,7,6,5,4,4,3,2,2 };

        System.out.println("Before Sorting");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("after sorting");
        printArray(arr);
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean Swapped;

        for (int i = 0; i < n - 1; i++) {
            Swapped = false;

            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    Swapped = true;
                }
            }
            if (Swapped != true) {
                break;
            }
        }
    }
    static void printArray(int[] arr){
        for(int val:arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}