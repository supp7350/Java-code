        import java.io.*;
class code10{
        public static void main(String[] args) throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                int sum=0;
            	
		int cnt=0;
                System.out.println("ENTER A NUMBER");
                int num=Integer.parseInt(br.readLine());
                int temp=num;
		while(temp>0){
			cnt++;
		
		}
		int temp2=num;
		int rem=0;
		while(temp>0){
			rem=temp%10;
			int pro=1;
                        for(int i=1;i<=cnt;i++){
				pro=pro*rem;
			}
			sum +=pro;
			temp/=10;
		}
                                 if(num==sum){
                              System.out.println(temp+"IS AN ARMSTRONG NUMBER");
                }
                else
                         System.out.println(temp+"IS NOT  AN ARMSTRONG NUMBER");
        }
}
