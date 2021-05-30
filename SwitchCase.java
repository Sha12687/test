import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.InputStreamReader;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        switch(n){
            case 18:
            System.out.println("You are become to adoult");
            break;
            case 21:
            System.out.println("you are going to get a job");
            break;
            case 60:
            System.out.println("YOu are going to retired");
            break;
            default:
            System.out.println("GO enjoy your life");
        }

    }
}
