import java.util.*;
class Demo6{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows :: ");
		int row = sc.nextInt();
		
		int num=row;
		for(int i=1;i<=row;i++){
			for(int k=1;k<i;k++){
				System.out.print(" "+"\t");
			}
			for(int j=row;j>=i;j--){
				System.out.print(num+"\t");
			}
			num--;
			System.out.println();
		}	
	}
}
 

