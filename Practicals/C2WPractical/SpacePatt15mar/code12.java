import java.io.*;
class Pattern12{
  public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter no. of rows : ");
    int row = Integer.parseInt(br.readLine());
    for(int i = 1;i<=row;i++) {
      for(int j =1;j<i;j++) {
        System.out.print("\t");
      }
      int num = i+64;
      for(int k=1;k<=row-i+1;k++) {
        if(row%2==0) {
	  if((i+k)%2==0) {
	    System.out.print(num+"\t");
	  }else {
	    System.out.print((char)num+"\t");
	  }
	}else {
	  if((i+k)%2==0) {
	    System.out.print((char)num+"\t");
	  }else {
	    System.out.print(num+"\t");
	  }
	}
       num++;	
      }
      System.out.println();
    }
  }
}
