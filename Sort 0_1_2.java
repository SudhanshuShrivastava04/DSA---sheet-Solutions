import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length; j++) {
        //         if (arr[i] < arr[j]) {
        //             int temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }
      
//       optimized code
        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;
        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] == 0) {
                countZero = countZero + 1;
            }
            if (arr[i] == 1) {
                countOne = countOne + 1;
            }
            if (arr[i] == 2) {
                countTwo = countTwo + 1;
            }
        }

        int i = 0;
        while (countZero != 0) {
            arr[i] = 0;
            i = i+1;
            countZero -= 1;
        }
        while (countOne != 0) {
            arr[i] = 1;
            i = i+1;
            countOne -= 1;
        }
        while (countTwo != 0) {
            arr[i] = 2;
            i = i+1;
            countTwo -= 1;
        }
    }
}
