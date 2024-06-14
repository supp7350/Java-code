import java.io.*;
class code9{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int row=Integer.parseInt(br.readLine());
                int sq=row*row;
        
                for(int i=1; i<=row ;i++){
                         int ch=64+row;
                        for(int j=1 ; j<=row ; j++){
				if((i==1) && (j==1)){
					System.out.print(sq + " ");
				}
				else if(j%2==0)
					System.out.print("@"+ " ");
				else
					System.out.print(sq*i + " ");
				sq--;
				}
			System.out.println();
		}
	}
}
