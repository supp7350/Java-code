        import java.io.*;
class code9{
        public static void main(String[] args) throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                int sum=0;

                System.out.println("ENTER A NUMBER");
                int num=Integer.parseInt(br.readLine());
            int rem=0;	
	    	int temp=num;
                while(temp>0){
                       sum=sum+rem;
		       temp/=10;
		    
		}
                      if(num%sum==0){
                              System.out.println(temp+"IS A HARSHAD NUMBER");
                }
                else
                         System.out.println(temp+"IS NOT  HARSHAD NUMBER");
        }
}
