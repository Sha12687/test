import java.util.*;

public class CountPairs {
    static int arr[] = new int[] { 1, 5, 7, -1, 5 };
    
    static int CoutPairs(int n ,int sum){
       HashMap<Integer, Integer >umap= new HashMap<> ();
       for(int i=0;i<n;i++){
           if(!umap.containsKey(arr[i])){
               umap.put(arr[i], 0);
               
           }
           umap.put(arr[i],umap.get(arr[i]+1));
       }
       int twice_count = 0;
       for(int i=0;i<n;i++){
        twice_count += umap.get(sum - arr[i]);
       }
       return twice_count/2;   
}
public static void main(String[] args)
{

    int sum = 6;
    System.out.println(
        "Count of pairs is "
        + CoutPairs(arr.length, sum));
}
}
