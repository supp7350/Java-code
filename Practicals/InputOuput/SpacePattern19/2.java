import java.util.*;
class Demo2{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows :: ");
		int row = sc.nextInt();
		
		for (int i=1;i<= row;i++){
			for(int k=row;k>i;k--){
				System.out.print(" "+"\t");
			}
			int num =row;
			for(int j=1;j<=i;j++){
				System.out.print(num--+"\t");
			}
			System.out.println();
		}
		
	}
}

