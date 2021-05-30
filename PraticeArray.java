

public class PraticeArray {
    public static void main(String[] args) {
        int [] Array={11,12,13,14,15,16,17,18};
        int j=0 ,reverse;
        for(int i=Array.length-1;i>=Array.length/2;i--){
          reverse=Array[j];
            Array[j]=Array[i];
          Array[i]=reverse;
          j++;
        }
        for( int  element: Array ){
            System.out.println(element);
        }
      }

}



  // float sum=0;
        // float [] exaple={ 10.0f,10.5f,11.1f,12.5f,16.5f,17.8f};
        // for( float  element: exaple )
        // {
        //     sum=sum+element;
        // }
        // System.out.println(sum);



        // int n=22;
        // boolean check=false;
        // for(int element:Array){
        //     if(n==element){
        //         System.out.println("the value is present in the array");
        //         check=true;
        //         break;
        //     }
        // }
        // if(check!=true){
        //     System.out.println("the value is not present in the Array");
        // }



        // int [] Array={11,12,13,14,15,16,17,18};
    //   int sum=0;
    //   for(int element:Array){
    //     sum=sum+element;
    //       }
    //       System.out.println("the Average value of numbers is " +sum/Array.length );


    // int [][] malti={{1,2,3,},{4,5,6,}};
    //     int [][] malt2={{6,7,8},{9,10,11}};
    //     int [][] malt3={{0,0,0},{0,0,0}};
    //      for(int i=0;i<malti.length;i++){
    //   for(int j=0;j<malt2[i].length;j++){
    //     malt3[i][j]=malti[i][j]+malt2[i][j];
    //     System.out.println (malt3[i][j]);
    //   }
    //      }