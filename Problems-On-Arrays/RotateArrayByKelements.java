import java.util.Arrays;
import java.util.Scanner;

/*
Problem Statement: Given an array of integers, rotating array of elements by k elements either left or right
Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2 , right
Output: 6 7 1 2 3 4 5
Explanation: array is rotated to right by 2 position .
 */
public class RotateArrayByKelements {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = SC.nextInt();
        }
        int k = SC.nextInt();
        k = k%n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
        //int[] result = solve(n, arr, k);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr, int start, int end){
        // SWAP
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end --;
        }

    }
}
