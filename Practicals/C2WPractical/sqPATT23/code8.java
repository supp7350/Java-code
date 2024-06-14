import java.io.*;
class code8{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int row=Integer.parseInt(br.readLine());
                int num=row;
                int ch=97+row;//
                for(int i=1; i<=row ;i++){
                        for(int j=1 ; j<=row ; j++){
				if(i%2==1){
					if(j%2==1){
						System.out.print((num*num-1) + " ");
			//			num++;
					}
					else{
						System.out.print((char)ch + " ");
					}
				}
				else{
	 				System.out.print((char)ch + " ");
	     			}
               		num++;	
				ch++;
		              }
			System.out.println();
		}
	}
}	

