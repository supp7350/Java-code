import java.util.*;
class Demo8{
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();

		int num1=num;
		int temp;
		while(num!=0){
			temp=num%10;
			if(temp==0){
				System.out.println(num1+" is DUCK number!!");
				break;
				
			}
			num/=10;
		}
		if(num==0){
			System.out.println(num1+" is not a DUCK number!!");
		}
	}
}

