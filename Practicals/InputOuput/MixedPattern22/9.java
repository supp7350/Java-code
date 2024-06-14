import java.util.*;
class Demo9{
	public static void  main(String [] args){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter number of rows : ");	
		int row = sc.nextInt();

		for(int i=1;i<=row;i++){
			int num = row*2-1;
			for(int k=row;k>i;k--){
				System.out.print("\t");
				num--;
			}
			for(int j=1;j<=i*2-1;j++){
				System.out.print(num-- +"\t");
			}
			System.out.println();
		}
	}
}

