import java.util.*;
class Demo3{
	public static void main(String [] args){
			
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();
		
		int num=row*(row+1);
		for(int i =1;i<=row;i++){
			for(int j=row;j>=i;j--){
				System.out.print(num + " " );
				num= num-2;
			}
			System.out.println();
		}	
	}		
}

