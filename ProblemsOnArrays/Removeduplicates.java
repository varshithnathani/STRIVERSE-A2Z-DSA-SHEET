import java.util.Scanner;
import java.util.*;

/*
Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once.
The relative order of the elements should be kept the same.

If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result.
 It does not matter what you leave beyond the first k elements.

Note: Return k after placing the final result in the first k slots of the array.
 */
public class Removeduplicates {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = SC.nextInt();
        }
        int result = solve(n, arr);
        System.out.println(result);
        SC.close();
    }
    public static int solve(int n, int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            set.add(arr[i]);
        }
        return set.size();
    }

}
