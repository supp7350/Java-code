import java.util.*;
class Demo7{
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
		System.out.println("Reverse of "+x+" is "+temp);
	}
}

