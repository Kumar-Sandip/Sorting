package BasicSorting.SelelctionSort;

public class Findexthe_minimum_IndexInArr {
    public static void main(String[] args) {
        int [] arr = { 10, 4,-3,20,-6};
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int mindx = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i]<min){
                min = arr[i];
                mindx = i;
            }
        }
        System.out.println(min+" "+mindx);

    }
}
