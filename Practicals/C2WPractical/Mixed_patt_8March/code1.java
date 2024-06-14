import java.io.*;
class  code1{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int row=Integer.parseInt(br.readLine());
		 System.out.println("ENTER ROWS");
		int num=1;
		for(int i=1;i<=row;i++){
			for (int j=1;j<=row;j++)
		System.out.print(num++ + " ");
	System.out.println();
	}
}
}
