import java.io.*;
class code10{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int row=Integer.parseInt(br.readLine());
                for(int i=1; i<=row ;i++){
       			int num=row;
			int h= 63+row;
			int numm=row;
      			int ch=64+row;
                        for(int j=1 ; j<=row ; j++){
				if(i%2==0){
					 System.out.print((char)ch-- + " ");
				}
				else{

					if(j%2==1){
						 System.out.print(numm + " ");
						 numm-=2;
					}
						 else{
						  System.out.print((char)h + " ");
						  h-=2;
					 }
					}
				
			//	h--;
				num--;
		
			}
		
			   System.out.println();
		}
	}
}
							 
					
