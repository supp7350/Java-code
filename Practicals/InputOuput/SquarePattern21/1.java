import java.util.*;
class Demo1{
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();

		for(int i=1;i<=row;i++){
			int num=row;
			for(int j=row;j>=1;j--){
				if(i%2==1){
					System.out.print((char)(64+num) + "\t");
					num--;
				}else{
					System.out.print(row + "\t");
				}
			}
			System.out.println();
		}
	}
}

