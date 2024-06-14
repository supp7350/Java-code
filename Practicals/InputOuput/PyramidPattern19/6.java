import java.util.*;
class Demo6{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row =sc.nextInt();
		
		
		for(int i=1;i<=row;i++){
			int num =row;
			for(int k=row;k>i;k--){
				System.out.print("\t");
			}
			for(int j=1;j<=i*2-1;j++){
				if(j<i){
					System.out.print(num-- +"\t");
				}else{
					System.out.print(num++ + "\t");
				}
			}
			
			System.out.println();
		}
	}
} 

