public class MultiDimensionalArray {
     public static void main(String[] args) {
         int [][] flat;
         flat= new int [2][3];
         flat[0][0]=101;
         flat[0][1]=102;
         flat[0][2]=103;
         flat[1][0]=104;
         flat[1][1]=105;
         flat[1][2]=106;
         for(int i=0;i<flat.length;i++){
             for(int j=0;j<flat[i].length;j++){
                System.out.println (flat[i][j]);
             }
         }
     }
}
