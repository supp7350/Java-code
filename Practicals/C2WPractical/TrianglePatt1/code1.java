import java.io.*;
class code1{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int row = Integer.parseInt(br.readLine());
		for (int i=1 ; i<=row ; i++ ){
		        for (int j=1 ; j<=i ; j++){
				 System.out.print("*");
			}
			 System.out.println();
		}
	}
}
