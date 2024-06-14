import java.io.*;
class code1{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int row=Integer.parseInt(br.readLine());
              int ch=64+row;//
                for(int i=1; i<=row ;i++){
                         
                        for(int j=1 ; j<=row ; j++){
	
				if( j==1)
					System.out.print((char)ch + " ");
				else{
					ch=ch+32;
					System.out.print((char)ch + " ");
					ch=ch-32;
				}
				ch++;
			}
		
			System.out.println();
		}
		}
}
