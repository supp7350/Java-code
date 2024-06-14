 import java.io.*;
 class Pattern7 {
   public static void main(String[] args)throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.print("enter no. of of rows : ");
     int row = Integer.parseInt(br.readLine());
     for(int i=1;i<=row;i++) {
       for(int j=1;j<i;j++) {
         System.out.print("\t");
       }
       for(int k=1;k<=row-i+1;k++) {
         System.out.print("*"+"\t");
       }
       System.out.println();
     }
   }
 }
