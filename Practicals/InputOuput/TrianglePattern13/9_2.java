import java.util.*;
class Demo9i{
	public static void main(String [] args){
			
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();
		
		int num= row*(row+1);
		num--;
		for(int i =1;i<=row;i++){
			int num1=num;
			for(int j=row;j>=i;j--){
				System.out.print(num1-- + " " );
				num=num-2;
			}
			System.out.println();
		}	
	}		
}

