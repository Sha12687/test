import java.util.Scanner;
public class Metods {
    public static int factorial(int n){
        int m=1;
    for(int i=n;i>0;i--){
       m=m*i;
    }
    return m;}

   public static void main(String[] args) {
    
 
    int n;
Scanner SC=new Scanner (System.in);
System.out.println("Enter the number you find for factorial");
n=SC.nextInt();
int x = factorial(n);
System.out.println("The Factorial of "+ n +" is: " +x);
   }  
}
