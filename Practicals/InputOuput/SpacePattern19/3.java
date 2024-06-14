import java.util.*;
class Demo3{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows :: ");
		int row = sc.nextInt();
		
		
		for(int i=1;i<=row;i++){
			int num=65;
			for(int k=row;k>i;k--){
				System.out.print(" "+"\t");
				num++;
			}
		
			for(int j=1;j<=i;j++){
				System.out.print((char)(num) +"\t");
				num++;
			}
			num--;
			System.out.println();
		}
	}
}


