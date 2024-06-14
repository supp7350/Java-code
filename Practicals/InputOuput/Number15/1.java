import java.util.*;
class Demo1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");	
		int num = sc.nextInt();
		
		System.out.print("Factors of "+ num+" are ");	
	
		int temp=1;
		while(temp<=num){
			if(num%temp ==0){
				System.out.print( temp + " ," );
			}
			temp++;
		}
		System.out.println();
	}
}

