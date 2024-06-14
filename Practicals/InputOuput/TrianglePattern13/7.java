import java.util.*;
class Demo7{
	public static void main(String [] args){
			
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();
		
	
		for(int i =row;i>=1;i--){
			int num=i;
			for(int j=1;j<=i;j++){
				if(j%2==1){
					System.out.print(num + " " );
				}else{
					System.out.print((char)(num+96) + " ");
					
				}
				num--;
			}
			System.out.println();
		}	
	}		
}

