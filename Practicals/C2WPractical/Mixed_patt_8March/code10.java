import java.io.*;
class  code10{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                
                 System.out.println("ENTER ROWS");
		 int num=Integer.parseInt(br.readLine());
                 while(num>0){
                 int rem=num%10;
	         num=num/10;
                 if(rem %2 ==1)                    
	         System.out.print((rem*rem)+ " ");
                      


                }
        }
}
