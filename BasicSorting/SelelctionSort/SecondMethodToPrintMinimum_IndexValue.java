package BasicSorting.SelelctionSort;

public class SecondMethodToPrintMinimum_IndexValue {
    public static void print(int[] arr) {  // THIS IS A SELECTION SORT............../
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void swap(int [] arr, int i, int j) {
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10, 4, -3, 20, -6};
        int n = arr.length;
        print(arr);
        for (int i = 0; i < n-1; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for (int j=i ; j <n ; j++) {
                if (arr[j]<min){
                    min  = arr[j];
                    mindx =j;

                }

            }
// using Swapping Technique...
            int temp = arr[i];
            arr[i] =arr[mindx];
            arr[mindx] = temp;
        }
        print(arr);
    }
}