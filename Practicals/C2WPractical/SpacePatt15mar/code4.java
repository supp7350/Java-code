
import java.io.*;
class Pattern4 {
  public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter no. of rows : ");
    int row = Integer.parseInt(br.readLine());
   
    for(int i =1;i<=row;i++) {
      for(int j =1;j<=row-i;j++) {
        System.out.print("  ");
      }
      int num = row -i+1;
      for(int k =1;k<=i;k++) {
        System.out.print((char)(num+64)+" ");
	num++;
      }
      System.out.println();
    }
  }
}
