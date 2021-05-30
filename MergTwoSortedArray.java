import java.util.*;
public class MergTwoSortedArray{
    static int arr1[] = new int[]{1, 5, 9, 10, 15, 20};
    static int arr2[] = new int[]{2, 3, 8, 13};
    static void merg(int m,int n){
        for(int i=n-1;i>=0;i--){
             int j,last=arr1[n-1];
             for(j=n-1;j>=0&& arr1[j]>arr2[i];j--){
                 arr1[j+1]=arr1[j];
             }
             if(j!=m-2||last>arr2[i]){
                 arr1[j+1]=arr2[i];
                 arr2[i]=last;
             }
        }
    }
}