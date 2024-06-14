import java.io.*;
class  code9{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int row=Integer.parseInt(br.readLine());
                 System.out.println("ENTER ROWS");
		 
                	int ch=63+row;
                 for(int i=1;i<=row;i++){
        //             int ch=65+i;
			 int num=1;
                     for (int j=1;j<=row-i+1;j++){
                                if(i%2==1){
                                System.out.print(num++ + " ");
                        }

                        else{
                	//	int ch=64+i;
                                System.out.print((char)ch-- + " ");
                                 }
                        }
         System.out.println();


                }
        }
}
