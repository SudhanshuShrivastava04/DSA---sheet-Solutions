import java.util.* ;
import java.io.*;
public class Solution {
    public static int sumOfMaxMin(int[] arr, int n) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max<arr[i]) {
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        int sum = max + min;
        return sum;
    }
}
