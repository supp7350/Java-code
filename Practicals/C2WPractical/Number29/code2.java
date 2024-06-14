
	        import java.io.*;
class code2{
        public static void main(String[] args) throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("ENTER A NUMBER");
                int num=Integer.parseInt(br.readLine());
		int sum=0;
		int fact=1;
		int temp=num;
		while(num>0){
			int rem=num%10;
			for(int i=1; i<=rem;i++){
				fact=i*fact;
			}
		num=num/10;
		sum=sum+fact;

		if(sum==temp){
			System.out.println(temp+ " IS A STRONG NUMBER");
		}
		else{
		System.out.println(temp+ " IS NOT A STRONG NUMBER");
		}
	}
}


