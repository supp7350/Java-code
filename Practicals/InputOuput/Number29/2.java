import java.io.*;
class Demo2{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number you have to check Strong or not : ");
		int num = Integer.parseInt(br.readLine());
			
		int temp=0;
		int sum=0;
		int num1 = num;
		while(num>0){
			temp = num%10;
			int mul=1;
			while(temp>1){
				mul = mul*temp;
				temp--;	
			}
			
			sum=sum+mul;
			num/=10;
		}
	
		if(sum == num1){
			System.out.println(num1+ " is Strong number!!");
		}else{
			System.out.println(num1 + " is not a Strong number !!");
		}
	}
}


