import java.io.*;
class code1 {
  public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter no. of rows : ");
    int row = Integer.parseInt(br.readLine());
    for(int i=1;i<=row;i++) {
      for(int j =1;j<=row-i;j++) {
        System.out.print("  ");
      }
      for(int k=1;k<=i;k++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
