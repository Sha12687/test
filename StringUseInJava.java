import java.util.Scanner;
public class StringUseInJava {
    public static void main(String[] args) {
     
  Scanner sc=new Scanner(System.in);
  System.out.println("Etner the first string ");
        String a=sc.next();
       int b= a.length();
  System.out.println(" "+b);
  System.out.println("to lower case "+a.toLowerCase());       
  System.out.println("to upper case "+a.toUpperCase());  
  String  nonTrimString="Harry Potter  ";    
  System.out.println("to non trim String "+nonTrimString.trim());       
  System.out.println("to sub String "+nonTrimString.substring(3));       
  System.out.println("to sub String "+nonTrimString.replace("r","air"));       
  System.out.println(" String start with par or not  "+nonTrimString.startsWith("par"));       
  System.out.println("character present at index: "+nonTrimString.charAt(3));       
  System.out.println("character present at index: "+nonTrimString.charAt(3));       
  System.out.println("character  present at index: "+nonTrimString.indexOf("a"));       
  System.out.println("search character from last index: "+nonTrimString.lastIndexOf("rry",6));       



} 
}


   // String name="Shashant";
        // System.out.println("My name is ");
        // System.out.println(name);
        // float b=15.66f;
//  System.out.printf("the vale uf a is %c value of b is %f",a,b);