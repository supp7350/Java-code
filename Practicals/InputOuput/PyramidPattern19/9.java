import java.util.*;
class Demo9{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row =sc.nextInt();
		
		for(int i=1;i<=row;i++){
			for(int k=row;k>i;k--){
				System.out.print("\t");
			}
			int num =65;
			for(int j=1;j<=i*2-1;j++){
				if(j<i && i%2==1){
					System.out.print(((char)num++ +"\t"));
				}else if(j<i && i%2==0){
					System.out.print((char)(num+32) +"\t");
					num++;
				}else if(j>=i && i%2==1){
					System.out.print((char)num-- +"\t");
				}else{
					System.out.print((char)(num+32) +"\t");
					num--;	
				}
			}
			System.out.println();
		}
	}
} 

