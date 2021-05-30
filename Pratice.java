import java.util.Scanner;
public class Pratice {
    public static void main(String[] args) {
        float m1=3.3f,tax=0;
        Scanner sc=new Scanner(System.in);
        tax=sc.nextFloat();
   if(tax<2.5f){
       tax=tax+0;
   }
   else if(tax>2.5f && tax<5f)
   { tax=tax+0.05f*(m1-2.25f);      
    }
    else if( tax>5f && tax<10f){
     tax=tax +0.05f*(5.0f-2.5f);
     tax=tax+ 0.05f *(m1-5f);
    }
    else if(tax>10.0f){
        tax=tax+0.05f*(5.0f-2.5f);
        tax=tax+0.05f*(10.0f-5f);
        tax=tax+0.03f*(m1-10.0f);
    }
}
}


// // question 2
// Scanner sc=new Scanner(System.in);
// System.out.println("Your mark in physics");
// m1=sc.nextInt();
// System.out.println("Your mark in chemistry");
// m2=sc.nextInt();
// System.out.println("Your mark in Maths");
// m3=sc.nextInt();
// float Avg=(m1+m2+m3)/3.0f;
// System.out.println("Your overall percentage is :"+ Avg);
// if(Avg>=40 && m1>33 && m2>33 && m3>33){
// System.out.println("You have been promoted");
// }
// else{
// System.out.println("You are not promoted!! Plese try Again");
// }