import java.io.*;
class Demo8{
	public static void main(String [] args) throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter the number of rows : ");
		int row = Integer.parseInt(br.readLine());
		
		int num =97;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				if(j%2==0){
					num=num+2;
					System.out.print((char)num + " ");
				}else {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}
}

