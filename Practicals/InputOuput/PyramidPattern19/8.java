import java.util.*;
class Demo8{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row =sc.nextInt();
		
		int num =row;
		for(int i=1;i<=row;i++){
			for(int k=row;k>i;k--){
				System.out.print("\t");
			}
			for(int j=1;j<=i*2-1;j++){
				System.out.print(num +"\t");
			}
			num--;
			System.out.println();
		}
	}
} 

