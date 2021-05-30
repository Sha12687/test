import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.*;
import java.util.Scanner;
public class BufferReader {
    public static void main(String[] args) throws IOException {
        String intro;
        // inputstraemreader return   reader object class object
        // inputstream reader is class
        InputStreamReader ISR=new InputStreamReader(System.in);
        BufferedReader Br=new BufferedReader(ISR);
        System.out.println("Enter a String:");
        intro= Br.readLine();
        System.out.println(intro);
        System.out.println("Entre a integer: ");
        int a=Integer.parseInt(Br.readLine());
        System.out.println(a);
        Scanner sc=new Scanner(System.in);
        String name;
       name=sc.nextLine();
       System.out.println(name);
    }
}
