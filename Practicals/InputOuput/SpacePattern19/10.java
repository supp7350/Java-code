import java.util.*;
class Demo10{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows :: ");
		int row = sc.nextInt();
		
		
		for(int i=1;i<=row;i++){
			int num=65;
			for(int k=1;k<i;k++){
				System.out.print(" "+"\t");
				num++;
			}
			
			for(int j=row;j>=i;j--){
				if((i+j)%2==1){
					System.out.print(num++ +"\t");
				}else{
					System.out.print((char)num +"\t");
					num++;
				}
			}
			System.out.println();
		}	
	}
}
 

