 import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        float a,b,c,d,e;
        float total=500;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the mark of first subject");
  a= sc.nextFloat();
  System.out.println("Enter the mark of second subject");
b=sc.nextFloat();
System.out.println("Enter the mark of third subject");
c=sc.nextFloat();
System.out.println("Enter the mark of fourth subject");
d=sc.nextFloat();
System.out.println("Enter the mark of fifth subject");
e=sc.nextFloat();
System.out.println(a+b+c+d+e);
float percentage=((a+b+c+d+e)/total)*100;
System.out.println("your percentage is "+ percentage +" from your total subject ");
    }
}
