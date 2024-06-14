import java.io.*;
class Demo9{
	public static void main(String [] args) throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter the number of rows : ");
		int row = Integer.parseInt(br.readLine());
		
		int num1 = 97;
		for(int i=1;i<=row;i++){
			int num2=row+1;
			for(int j=1;j<=i;j++){
				if(j%2==1){
					System.out.print(num2 + " ");
				}else {
					System.out.print( (char)num1 + " ");
					num1++;	
				}
				num2++;
			}
			System.out.println();
		}
	}
}

