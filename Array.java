import java.lang.*;
public class Array {
    public static void main(String[] args) {
         int [] marks={98,89,90,85,88,77,66};
         System.out.println(marks.length);
         System.out.println(marks[2]);
         String [] family={"Prashant","Nishant" ,"Shrikant","Hemu","Shikhar"};
         System.out.println(family.length);
         System.out.println(family[3]);

         // Display the Array using FOOR loop
        //  for(int i=0;i<marks.length;i++){
        //      System.out.println(marks[i]);
        //  }\
        // Display the Array using FOOR each loop\
        for(int element : marks){
            System.out.println(element);
        }
        for (String element : family) {
            System.out.println(element);
        }
    }
}
