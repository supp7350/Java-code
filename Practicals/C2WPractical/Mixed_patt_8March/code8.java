import java.io.*;
class  code8{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
               
                 System.out.println("ENTER ROWS");
		int row=Integer.parseInt(br.readLine());
                int sum=row+row+64; 
		if(row%2==0){
		sum=row+row+64+2;  
			}
		else{
			sum=row+row+64+1;

		}
                for(int i=1;i<=row;i++){
			for (int j=1;j<=row-i+1 ; j++){
                 
                       
                  System.out.print((char)sum-- + " ");

                        }       
                       System.out.println();


                }
        }
}
///WRONG O*P;
//
//
//
//
//
