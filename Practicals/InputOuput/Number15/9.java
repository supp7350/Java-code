import java.util.*;
class Demo9{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");	
		int num = sc.nextInt();
		
		int num1;	
		int x=num;	
		int temp =0;
		while(num>0){
			num1=num%10;
			temp=temp*10+num1;
			num/=10;
		}
		
		if(x==temp){
			System.out.println(x + " is a palindrome number");
		}else{
			System.out.println(x + " is not a palindrome number");
		}
	}
}

