package BasicSorting.BubbleSort;

public class  BubbleSortDescending {
    public static void main(String[] args) {
        int[] array = {53,55,444,333,332,555,556,544,88,777};

        bubbleSortDescending(array);

        System.out.println("Sorted array in decreasing order:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void bubbleSortDescending(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, then the array is already sorted
            if (!swapped) break;
        }
    }
}
