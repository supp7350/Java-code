import java.util.*;
class Demo7{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row =sc.nextInt();
		
		int num =1;
		for(int i=1;i<=row;i++){
			for(int k=row;k>i;k--){
				System.out.print("\t");
			}
			for(int j=1;j<=i*2-1;j++){
				if(i%2==1){
					System.out.print(num +"\t");
				}else{
					System.out.print((char)(num+64) + "\t");
				}
			}
			num++;
			System.out.println();
		}
	}
} 

