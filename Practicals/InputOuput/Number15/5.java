import java.util.*;
class Demo5{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");	
		int num = sc.nextInt();
		
		int x=num;	
		int temp =1;
		while(num>=1){
			temp=temp*num;
			num--;
		}
		System.out.println("Factorial of "+x+" is "+temp);
	}
}

