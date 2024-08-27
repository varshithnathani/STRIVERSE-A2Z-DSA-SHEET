package ProblemsOnArrays;

import java.util.Scanner;

public class LongestSubArrayWithSum {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = SC.nextInt();
        }

        solve(arr, n);
    }
    public static void solve(int[] arr, int n){
        int max = Integer.MIN_VALUE;
        int currSum =0;
        for(int i =0; i<n; i++){
            for(int j =i; j<n; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                }
                if (max < currSum) {
                    max = currSum;
                }
            }
        }
        System.out.println(max);
    }
}
