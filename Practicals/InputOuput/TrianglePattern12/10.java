import java.io.*;
class Demo10{
	public static void main(String [] args) throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter the number of rows : ");
		int row = Integer.parseInt(br.readLine());
		
		int num1 = 1;
		int num2 = 97;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				if(i%2==1){
					System.out.print(num1 + " ");
				}else {
					System.out.print( (char)num2 + " ");
				}
				num1++;
				num2++;
			}
			System.out.println();
		}
	}
}

