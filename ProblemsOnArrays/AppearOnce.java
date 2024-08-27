import java.util.Scanner;

/*
Problem Statement:
    Given a non-empty array of integers arr, every element appears twice except for one.
    Find that single one.
 */
public class AppearOnce {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = SC.nextInt();
        }
        System.out.println(BruteForce(arr, n));
        System.out.println(Optimal(arr,n));
    }
    public static int BruteForce(int[] arr, int n){
        for(int i =0; i<n; i++){
            int count =0;
            for(int j =0; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }

            }
            if(count == 1){
                return i;
            }
        }
        return -1;
    }

    public static int Optimal(int[] arr, int n){
        int xor = 0;
        for(int i =0; i<n; i++){
            xor = xor ^ arr[i];
        }
        return xor;
    }

}
