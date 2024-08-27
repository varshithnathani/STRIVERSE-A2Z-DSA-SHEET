package ProblemsOnArrays;

public class SubArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j =i; j<n; j++){
                for(int k =i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                    count++;
                }
                System.out.println();
            }
        }
        System.out.println("Count :"+count);
    }
}
