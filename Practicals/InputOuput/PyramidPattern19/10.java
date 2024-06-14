import java.util.*;
class Demo10{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row =sc.nextInt();
		
		int num1= row;
		for(int i=1;i<=row;i++){
			int num=num1;
			for(int k=row;k>i;k--){
				System.out.print("\t");
			}
			for(int j=1;j<=i*2-1;j++){
				if(j<i){
					System.out.print((char)(num+64) +"\t");
					num++;	
				}else{
					System.out.print((char)(num+64) + "\t");
					num--;
				}
			}
			num1--;		
			System.out.println();
		}
	}
} 

