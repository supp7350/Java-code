import java.io.*;
class Demo5{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number of rows : ");
		int row = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=row;i++){
			int num = i;
			for(int j=1;j<=i;j++){
				System.out.print(num*j +" ");
			}
			System.out.println();
		}
	}
}

