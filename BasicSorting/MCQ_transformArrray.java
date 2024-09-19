package BasicSorting;

public class MCQ_transformArrray {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {30, 40, 12, 44, 36, 56, 60, 70};
        //            1  2  0  5  4   5 6  7 like that
        int n = arr.length;
        print(arr);
        int x = 0;
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for (int j = 0; j < n; j++) {
                if (arr[j] < min && arr[j] > 0) {
                    min = arr[j];
                    mindx = j;

                }


            }
            arr[mindx] = x;
            x--;

        }
        print(arr);
        for (int i = 0; i < n; i++) {

            arr[i] *= (-1);
        }
        print(arr);
    }
}