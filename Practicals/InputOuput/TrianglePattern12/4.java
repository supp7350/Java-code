import java.io.*;
class Demo4{
	public static void main(String [] args) throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter the number of rows : ");
		int row = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=row;i++){
			int num1 =96+row;
			int num2 =64+row;
			for(int j=1;j<=i;j++){
				if(i%2==1){
					System.out.print((char)num1-- + " ");
				}else {
					System.out.print((char)num2-- + " ");
				}
			}
			System.out.println();
		}
	}
}

