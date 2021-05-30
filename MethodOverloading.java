public class MethodOverloading {
    static int sun(int ...arr){
        int sum=0;
          for (int st : arr) {
     sum=sum+st;
}
return sum;
      }
    public static void main(String[] args) {
        System.out.println("Welcomne to VERGS");
     System.out.println("THe sum of 4 , 5, 7, 10 is :"+ sun( 4,5,7,10));
    }
}
