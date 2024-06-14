import java.util.*;
class Demo1{
	public static void main(String [] args){
			
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();

		for(int i =1;i<=row;i++){
			int num =i;
			for(int j=row;j>=i;j--){
				System.out.print(num++ + " " );
			}
			System.out.println();
		}	
	}		
}

