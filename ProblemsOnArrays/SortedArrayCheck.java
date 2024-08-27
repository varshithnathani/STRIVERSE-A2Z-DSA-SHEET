/*
Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not.
 If the array is sorted then return True, Else return False.
 */
import  java.util.*;

public class SortedArrayCheck{
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
    public static boolean solve(int n, int[] arr){
        for(int i =0; i<n-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return  true;
    }
}