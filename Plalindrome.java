import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Plalindrome {
    static boolean palindrome(String name){
        int j=0;
     for(int i=name.length()-1;i>=name.length()/2;i--){
         if(name.charAt(i)==name.charAt(j)){
         j++;}
         else{
             return false;
         }
     }
     return  true;
    }
public static void main(String[] args) throws IOException  {
    String name;
    Boolean b1 = true;  
    Boolean b2 = false;  
    BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
    name= BR.readLine();
    System.out.println(name);
  boolean b3=palindrome(name);
  if(b3==b1){
      System.out.println("YEs the String is Palindrom");
  }
  else{
      System.out.println("the string is not palindrome");
  }
}    
}
