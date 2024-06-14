import java.io.*;
class code10{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int row=Integer.parseInt(br.readLine());
                int sq=row*row;
        //      int ch=64+row;//
                for(int i=1; i<=row ;i++){
                        for(int j=1 ; j<=row ; j++){
				if(i==j)
					System.out.print("$" + " ");
				else
					System.out.print(sq*j + " ");
				sq--;
			}
			System.out.println();
		}
	}
}
