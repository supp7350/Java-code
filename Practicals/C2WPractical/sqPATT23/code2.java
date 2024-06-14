import java.io.*;
class code2{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int row=Integer.parseInt(br.readLine());
                int num=row;
                int ch=96+row;//
                for(int i=1; i<=row ;i++){
//                         int ch=64+row;
                        for(int j=1 ; j<=row ; j++){
				if((i==row) || (j==row)){
					ch=ch-32;
					System.out.print((char)ch + " ");
					ch+=32;
				}
				else{
					System.out.print((char)ch + " ");
				}
				ch++;
			}
		System.out.println();

		}
	}
}
