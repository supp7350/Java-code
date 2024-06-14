import java.io.*;
class Demo5{
	public static void main(String [] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number : ");
		int num = Integer.parseInt(br.readLine());

		if(num<0){
			System.out.println("Negative numbers will not be Automorphic !!");
			return;
		}
			
		int num1=num;
		int digit=0;
		int sq;
		while(num!=0){
			digit++;
			num/=10;
		}
		sq = num1*num1;
			
		int temp=0;
		int var=0;
		while(digit!=0){
			temp=sq%10;
			var=(var*10)+temp;
			sq/=10;
			digit--;
		}
			
		int rev=0;
		while(var!=0){
			temp=var%10;
			rev=(rev*10)+temp;
			var/=10;
		}
	
		if(rev==num1){
			System.out.println(num1+" is a Automorphic number!!");
		}else{
			System.out.println(num1+" is not a Auutomorphic number!!");
		}
	}
}

