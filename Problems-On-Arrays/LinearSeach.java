import java.util.Scanner;

/*
Problem Statement: Given an array, and an element num the task is to find if num is present in the given array or not.
 If present print the index of the element or print -1.
 */
public class LinearSeach {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = SC.nextInt();
        }
        int k = SC.nextInt();
        System.out.println(solve(arr, n, k));
    }
    public static int solve(int[] arr, int n, int k){
        for(int i =0; i<n; i++){
            if(arr[i] == k){
                return i;
            }
        }
        return -1;
    }
}
