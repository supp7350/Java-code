import java.io.*;
class Pattern3 {
  public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter no. of rows : ");
    int row = Integer.parseInt(br.readLine());
    for(int i=1;i<=row;i++) {
      for(int j =1;j<=row-i;j++) {
        System.out.print("  ");
      }
      for(int k=row;k>=row-i+1;k--) {
        System.out.print(k+" ");
      }
      System.out.println();
    }
  }
}
