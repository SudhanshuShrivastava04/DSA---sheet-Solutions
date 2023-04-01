import java.util.* ;
import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        int n = arr.size();
        int p = m+1;
        int q = n-1;
        while(p < q){
            // int temp = arr.get(p);
            // arr.get(p) = arr.get(q);
            // arr.get(q) = temp;
            Collections.swap(arr, p, q);
            p += 1;
            q -= 1;
        }
    }
}

