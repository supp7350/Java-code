import java.io.*;
class Demo6{
	public static void main(String [] args) throws IOException {

		InputStreamReader isr =new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                System.out.print("Enter the number of rows : ");
                int row = Integer.parseInt(br.readLine());

		for(int i=row;i>=1;i--){
			int num = i;
			for(int j=1;j<=i;j++){
				System.out.print(i +" ");
			}
			System.out.println();
		}
	}
}

