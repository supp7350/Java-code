import java.io.*;
class  code6{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int row=Integer.parseInt(br.readLine());
                 System.out.println("ENTER ROWS");

                for(int i=1;i<=row;i++){
                     int temp=row;
		 int ch=96+row;
                        for (int j=1;j<=i;j++){
                                if(i%2==1){
                                System.out.print((char)ch-- + " ");
                        }

                        else{
                                // h=i+h;
                                System.out.print(temp-- + " ");
                                 }
                        }
         System.out.println();
        

                }
        }
}
