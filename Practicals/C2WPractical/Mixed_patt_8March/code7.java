import java.io.*;
class  code7{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int row=Integer.parseInt(br.readLine());
                 System.out.println("ENTER ROWS");
int d=0;
                for(int i=1;i<=row;i++){
                     int num=2;
                      for (int j=1;j<=row-i+1;j++){
                        for(int k=1; k<=row ; k++){
                        	 d=d+num;
				System.out.print(d + " ");
                        }

                        }
                       
         System.out.println();


                }
        }

}
//////NOT WORKING
//
//
//
//
