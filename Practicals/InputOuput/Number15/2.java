import java.util.*;
class Demo2{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");	
		int num = sc.nextInt();
		
			
		int count =0;
		int temp=1;
		while(temp<=num){
			if(num%temp ==0){
				count++;
			}
			temp++;
		}
		
		if(count ==2){
			System.out.println(num +" is a prime number.");
		}else{
			System.out.println(num + " is not a prime number.");
		}
	}
}

