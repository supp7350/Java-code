import java.io.*;
class code6{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int row=Integer.parseInt(br.readLine());
                int num=row;
        //      int ch=64+row;//
                for(int i=1; i<=row ;i++){
                         int ch=64+i;
                        for(int j=1 ; j<=row ; j++){
				if(j%2==0) 
					System.out.print(num*num + " ");

				else{
					System.out.print(num + " ");
				}
				num++;
			}
		
			 System.out.println();
		}
	}
}

