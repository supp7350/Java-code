import java.io.*;
class Demo10{
	public static void main(String [] args) throws IOException{
		InputStreamReader isr =new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                System.out.print("Enter the number of rows : ");
                int row = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=row;i++){
			int num =(64+i);
			for(int j=row;j>=i;j--){
				if((i+j)%2 == 1){
					System.out.print(num + " ");
				}else{
					System.out.print((char)num +" ");
				} 
				num++;
			}
			System.out.println();
		}
	}
}

