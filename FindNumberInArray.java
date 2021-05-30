import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class FindNumberInArray {
    static int LinearSearch(int arr[] ,int b){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==b)
       { return i;}
    }
    return -1;
    }
    public static void main(String[] args) throws IOException {
        int Array[]=new int[10];
        int a,b;
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<Array.length;i++)
        {
         a=Integer.parseInt(BR.readLine());
         Array[i]=a;
        }
        System.out.println("Etner the nmuber you want to check");
        b=Integer.parseInt(BR.readLine());
        int c=  LinearSearch(Array,b );
     if(c>=0){
         System.out.println("Element present art index "+ c);
     }
     else{
         System.out.println("Element not present in the array");
     }
    }
 
}
