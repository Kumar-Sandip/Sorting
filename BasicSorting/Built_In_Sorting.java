package BasicSorting;

import java.util.Arrays;

public class Built_In_Sorting {
    public static void main(String[] args) {
        int [] arr = {2 ,3,5,22,5,3,23,24,-4};
        for (int ele: arr) {
            System.out.print(ele+" ");

        }
        System.out.println();
        Arrays.sort(arr);
        for (int ele: arr) {
            System.out.print(ele+" ");

        }
        System.out.println();
    }
}
