import java.util.Arrays;
import java.util.Scanner;

/*
Problem Statement: You are given an array of integers,
your task is to move all the zeros in the array to the end of the array and move non-negative integers to the front by maintaining their order.
 */
public class MoveZerosEnd {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = SC.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        solve(arr, n);
        System.out.println(Arrays.toString(arr));
    }
    public static void solve(int[] arr, int n){
        if(n <= 1){
            return;
        }
        int j =-1;
        for(int i =0; i<n; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        if(j == -1){
            return;
        }
        for(int i =j+1; i<n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return;
    }
}
