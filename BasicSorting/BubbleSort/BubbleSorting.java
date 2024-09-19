package BasicSorting.BubbleSort;

public class BubbleSorting {
    public static void print(int [] arr) {
        for (int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // first Method of bubble sort --1
        int [ ] arr = { 4,6,7,3,8,-4,9};
        int n = arr.length;
        print(arr);
//        for (int i = 0; i < n-1; i++) {
//            if(arr[i]>arr[i+1]){
//                int temp  = arr[i];
//                arr[i] = arr[i+1];
//                arr[i+1]= temp;
////            }
//
//        }
//        for (int i = 0; i < n-1; i++) {
//            if(arr[i]>arr[i+1]) {
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//            }
//        }
//        for (int i = 0; i < n-1; i++) {
//            if (arr[i] > arr[i + 1]) {
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//            }
//        }
//        for (int i = 0; i < n-1; i++) {
//            if (arr[i] > arr[i + 1]) {
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;




                // second method...of Bubble sort..--2
//        for (int x = 0; x <n-1 ; x++) {// any array for using this method(for (int x = 1; x<n-1;x++)..
//            // n-1 for sorting any arrays
//
//        for (int i = 0; i < n-1-x; i++) {
//            if(arr[i]>arr[i+1]){
//                int temp  = arr[i];
//                arr[i] = arr[i+1];
//                arr[i+1]= temp;
//           }
//            }
//        }



// Optimize Bubble sorting .....--3rd Method

        for (int x = 0; x <n-1 ; x++) {// any array for using this method(for (int x = 1; x<n-1;x++)..
            // n-1 for sorting any arrays
            boolean flag = true;
            for (int i = 0; i < n-1-x; i++) {
                if(arr[i]>arr[i+1]){
                    int temp  = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1]= temp;
                    flag = false;
//                }
//            }
//            boolean  flag = true;
//            for (int i = 0; i < n-1-x; i++) {
//                if(arr[i]>arr[i+1]){
//                    flag = false;
//                    break;

                }
        }
            if (flag==true)break;
        }

        print(arr);
    }
}
