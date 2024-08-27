import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/*
Problem Statement: Given two sorted arrays, arr1, and arr2 of size n and m.
Find the union of two sorted arrays.
 */
public class FindUnion {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int[] arr1 = new int[n];
        for(int i =0; i<n; i++){
            arr1[i] = SC.nextInt();
        }
        int m = SC.nextInt();
        int[] arr2 = new int[m];
        for(int i =0; i<m; i++){
            arr2[i] = SC.nextInt();
        }
        ArrayList<Integer> list = solve(arr1,arr2);
        for(int k: list){
            System.out.print(k+" ");
        }
        System.out.println();
    }
    public static ArrayList<Integer> solve(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            set.add(arr2[i]);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int k: set){
            list.add(k);
        }
        return list;
    }
}
