/*
 
Problem statement
Given an array ‘arr’ of size ‘n’ find the largest element in the array.

Example:
Input: 'n' = 5, 'arr' = [1, 2, 3, 4, 5]
Output: 5

Explanation: From the array {1, 2, 3, 4, 5}, the largest element is 5.
 */

import java.util.*;
public class LargestElementinArray{
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = SC.nextInt();
        }
        System.out.println(solve(n,arr));
        SC.close();
    }
    public static int solve(int n, int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i =0; i<n; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
