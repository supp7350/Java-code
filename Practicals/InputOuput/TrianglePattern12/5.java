import java.io.*;
class Demo5{
	public static void main(String [] args) throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter the number of rows : ");
		int row = Integer.parseInt(br.readLine());
		
		int num = 65+ row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print((char)num++ + " ");
			}
			System.out.println();
		}
	}
}

