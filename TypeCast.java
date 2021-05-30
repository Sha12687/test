import java.util.Scanner;

public class TypeCast {
 public static void main(String[] args) {
    //     char grade='B';
    //     grade=(char)(grade+8);
    //     System.out.println(grade);
    //     grade=(char)(grade-8);
    //     System.out.println(grade);
    // } 
    Scanner sc=new Scanner(System.in);
int v,u,a,s,t;
System.out.print("Enter the value of V " );
v=sc.nextInt();
System.out.print("Enter the value of U " );
u=sc.nextInt();
System.out.print("Enter the value of A " );
a=sc.nextInt();
System.out.print("Enter the value of S " );
s=sc.nextInt();
t=((v*v)-(u*u))/(2*a*s);
System.out.println("The value of (V^2 - U^2)/2*a*s "+t );
}
}
