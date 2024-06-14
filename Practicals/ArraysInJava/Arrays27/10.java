import java.util.*;
class Demo9{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();

		int count=0;
		int num1= num;
		while(num1>0){
			count++;
			num1=num1/10;	
		}
		
		
		int arr[] = new int[count];
		
	 	num1=num;
		for(int i=0;i<arr.length;i++){
			arr[i]=(num1%10)+1;
			num1=num1/10;
		} 
		
		for(int i=count-1;i>=0;i--){
			System.out.print(arr[i]+",");
		}
	}
}

