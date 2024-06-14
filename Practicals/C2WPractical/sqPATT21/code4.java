import java.io.*;
class code4{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int row=Integer.parseInt(br.readLine());
                int num=row;
        	int ch=64+row;
                for(int i=1; i<=row ;i++){
                         //int ch=64+row;
                        for(int j=1 ; j<=row ; j++){
				if (j==1){
					 System.out.print((char)ch+ " ");
				}
				else{
					 System.out.print(num + " ");
		
				}	
		
		//	 System.out.println();
 			num++;
			ch++;
			}
 System.out.println();
	
	}
}
}
