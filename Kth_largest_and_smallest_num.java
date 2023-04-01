import java.util.ArrayList;
import java.util.Collections;


public class Solution {
    public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
        Collections.sort(arr);
        int a = arr.get(k-1);
        int b = arr.get(n-k);
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(a);
        array.add(b);
        return array;
    }
}
