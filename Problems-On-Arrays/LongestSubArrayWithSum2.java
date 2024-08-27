package ProblemsOnArrays;

public class LongestSubArrayWithSum2 {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        int val = 14;
        int n = arr.length;
        int sum = 0;
        int len = 0;
        for(int i =0; i<n; i++){
            for(int j =i; j<n; j++){
                sum = 0;
                for(int k = i; k<= j; k++){
                    sum+= arr[k];
                }
                if(sum == val){
                    len = Math.max(len,j-i+1);
                }
            }
        }
        System.out.println(len);
    }
}
