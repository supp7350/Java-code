import java.io.*;
class code9{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int row=Integer.parseInt(br.readLine());


                for(int i=1; i<=row ;i++){
                         int ch=64+row;
                        for(int j=1 ; j<=row ; j++){
				if( i%2==0){
					if(j%2 !=0)
						 System.out.print(j*3+ " ");
					else{
						 System.out.print(j*2+ " ");
					}
				}
				else{
					if(j%2 ==0){
						 System.out.print(j*3 + " ");
							}
					else{
						 System.out.print(j*2 + " ");
					}
				}
	
			}
	 System.out.println();
		}
	}
}

