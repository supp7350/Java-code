import java.util.*;
class Demo9{
	public static void main(String [] args){
			
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();
		int sum =1;
		for(int i =1;i<=row;i++){
			for(int j=row;j>=i;j--){
				sum = sum+2; 
			}
		}
		sum =sum-2;
		for(int i =1;i<=row;i++){
			for(int j=row;j>=i;j--){
				System.out.print(sum + " " );
				sum= sum -2;
			}
			System.out.println();
		}	
	}		
}

