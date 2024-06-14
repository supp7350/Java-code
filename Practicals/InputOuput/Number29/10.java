import java.util.*;
class Demo10{
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();

		int num1=num;
		int temp;
		int digit =0;
		int num2 =num;
		while(num!=0){
			digit++;
			num/=10;
		}
		
		int sum=0;
		while(num1!=0){
			temp=num1%10;
			int var=1;
			int digit1=digit;
			while(digit1>0){
				var = var*temp;
				digit1--;
			}
			sum=sum+var;
			num1/=10;
		}
		if(num2==sum){
			System.out.println(num2+" is an ARMSTRONG number!!");
		}else{
			System.out.println(num2 +" is not an ARMSTRONG number!!");
		}
	}
}

