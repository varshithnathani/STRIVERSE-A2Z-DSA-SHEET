/*
 * 
 * Problem Statement: Given an array, find the second smallest and second largest element in the array. 
 *                      Print ‘-1’ in the event that either of them doesn’t exist.
 */
import java.util.*;

public class SecondSmallestandLargest {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = SC.nextInt();
        }
        int[] arr3 = solve(n, arr);
        System.out.println(Arrays.toString(arr3));
        SC.close();
    }
    private static int[] solve(int n, int[] arr){
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        int[] arr2 = new int[2];
        if(n<=2){
            arr2[0] = -1;
            arr2[1] = -1;
            return arr2;
        }
        for(int i=0;i<n; i++){
            large = Math.max(large,arr[i]);
            small = Math.min(small, arr[i]);
        }
        for(int i=0;i <n; i++){
            if(arr[i] < secondSmall && arr[i] != small){
                secondSmall = arr[i];
            }
            if(arr[i] > secondLarge && arr[i] != large){
                secondLarge = arr[i];
            }
        }
        arr2[0] = secondLarge;
        arr2[1] = secondSmall;
        return arr2;
    }
}
