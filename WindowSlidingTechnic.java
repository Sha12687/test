import java.util.*;
 import java. lang. Math;
public class WindowSlidingTechnic {
    public static int FindLongSubArray(int arr[],int n,int k){
        int max_sum=0;
        int current_sum=0;
        for(int i=0;i<k;i++ ){
     current_sum =current_sum+arr[i];
        }
        max_sum=current_sum;
        for(int j=k;j<n;j++){
            current_sum +=arr[j]-arr[j-k];
      max_sum=Math.max(max_sum,current_sum);
        }
        return max_sum;
    }
  public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;
        int n = arr.length;
  int ans =FindLongSubArray(arr, n, k);
System.out.println("Sum of subarray of K element is  "+ans );

    }
}
