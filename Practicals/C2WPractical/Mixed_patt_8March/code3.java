import java.io.*;
class  code3{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int row=Integer.parseInt(br.readLine());
                 System.out.println("ENTER ROWS");
                //int ch=64+row;
               // for(int i=1;i<=row;i++){
                        
               // int ch=64+row;
                for(int i=1;i<=row;i++){
			
                int ch=64+row;
			int num=1;
			for (int j=1;j<=row;j++){
                if (i%2==1){
				System.out.print((char)ch-- + " ");
		}
				else{
        System.out.print(num++ + " ");

        }
     }
      System.out.println();
   }
}

}
