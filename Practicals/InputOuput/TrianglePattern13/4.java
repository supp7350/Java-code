import java.util.*;
class Demo4{
	public static void main(String [] args){
			
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();
		int sum=0;
		for(int i =1;i<=row;i++){
				sum =sum+i;
		}
		for(int i =1;i<=row;i++){
			for(int j=row;j>=i;j--){
				System.out.print((char)(sum+64) + " " );
				sum--;
			}
			System.out.println();
		}	
	}		
}

