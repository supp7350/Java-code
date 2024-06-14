import java.io.*;
class code8{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int row=Integer.parseInt(br.readLine());
                int num=row;
      
                for(int i=1; i<=row ;i++){
                         int ch=64+row;
                        for(int j=1 ; j<=row ; j++){
				if(i%2==1){
					if (j %2==1)
						System.out.print("#  ");
					else
				{
		 System.out.print((char)ch-- + " ");		
				}
				}
				else{
			if(j%2==1)
		 System.out.print((char)ch-- + " ");
			else
		 System.out.print( "#  ");
				}
			}
			 System.out.println();
		}
	}
}
				
