import java.io.*;
class Demo3{
	public static void main(String [] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number : ");
		int num = Integer.parseInt(br.readLine());
	
		if(num<=0){
			System.out.println("Enter postive number because perfect number can't be negative !!");
			return;
		}	

		int sum=0;
		for(int i=1;i<=(num/2);i++){
			if(num%i==0){
				sum+=i;
			}
		}
	
		if(sum==num){
			System.out.println(num+" is a perfect number!!");
		}else if(sum>num){
			System.out.println(num+" is Abundant number!!");
		}else{
			System.out.println(num + " is Deficient number!! ");
		}
	}
}

