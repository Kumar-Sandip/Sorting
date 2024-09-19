package BasicSorting;

public class CheckitArraySort_orNot {
    public static void main(String[] args) {
        int [] arr = { 1,7,9,12,23,39};
        int n  = arr.length;
        boolean flage   = true; // means arr is sorted.
        for (int i = 0; i < n-1; i++){
            if(arr[i]>arr[i+1]){// so arr is not sorted ..
                flage  = false; // unsorted arr.
break;
            }

        }
        if (flage == true) System.out.println(" sorted Array ");
        else System.out.println("unsorted Array");
    }
}
