import java.util.Arrays;
import java.util.Scanner;

/*
Problem Statement: Given an array of N integers, left rotate the array by one place.
N = 5, array[] = {1,2,3,4,5}
2,3,4,5,1

 */
public class LeftRotateArraybyOne {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = SC.nextInt();
        }
        int[] result = solve(n, arr);
        System.out.println(Arrays.toString(result));
        SC.close();
    }
    public static int[] solve(int n, int[] arr){
        int[] arr2 = new int[n];

        for(int i=0; i<n-1; i++){
            arr2[i] = arr[i+1];
        }
        arr2[n-1] = arr[0];
        return  arr2;
    }
}
