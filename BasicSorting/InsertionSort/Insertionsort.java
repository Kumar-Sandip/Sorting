package BasicSorting.InsertionSort;

public class Insertionsort {
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
        int[] arr = {10, 4, -3,5,32, 20, -6};
        int n = arr.length;
        print(arr);
        for (int i = 1; i < n; i++) {
            for (int j = i; j >=1 ; j--) {
          if (arr[j]<arr[j-1])
              swap(arr, j, j - 1);
              else break;
          }
                }
print(arr);
            }
//
        }




