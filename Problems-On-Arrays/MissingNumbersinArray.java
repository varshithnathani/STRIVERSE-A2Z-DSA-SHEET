import java.util.Scanner;

/*
Problem Statement: Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N. Find the number(between 1 to N),
that is not present in the given array.
 */
public class MissingNumbersinArray {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = 4;
        int[] arr = {1,2,4};

        System.out.println(solve(arr, n));
    }
    public static int solve(int[] arr, int n){
        int sum = (n*(n+1))/2;
        int sum2 = 0;
        for(int i = 0; i<arr.length; i++){
            sum2+=arr[i];
        }
        return sum-sum2;
    }
}
