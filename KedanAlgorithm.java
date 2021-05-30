import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class KedanAlgorithm {
    static int LargestSubArray(int arr[], int n){
    int maximum=0,new_maximum=0;
    for(int j=0;j<n;j++){
        new_maximum =arr[j]+new_maximum;
      if(maximum<new_maximum){
          maximum=new_maximum;
      }
      if(new_maximum<0){
          new_maximum=0;
      }
    }
    return maximum;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the size of Array: ");
        int n=Integer.parseInt(br.readLine());
        int m;
        int Array[]=new int [n];
      for(int i=0;i<n;i++)
      {
     m=Integer.parseInt(br.readLine());
    Array[i]=m;
      }
      int sum= LargestSubArray(Array, n);
      System.out.println("Sum of largest sub Array is: "+ sum);
    }
}
