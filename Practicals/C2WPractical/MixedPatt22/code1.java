import java.io.*;
class code1{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int row=Integer.parseInt(br.readLine());
                int num=row;
        //      int ch=64+row;//
                for(int i=1; i<=row ;i++){
                    for (int s=1;s<=row-1;s++){
 			 for(int j=1 ; j<=row ; j++){
                        
                                System.out.print(num + " ");
				num+=2;
			 }
				 System.out.println();
		    }
		}

                        }
}
