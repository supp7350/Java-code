import java.util.*;
class Demo8{
	public static void main(String [] args){
			
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();
		
		int num= row;
		for(int i =1;i<=row;i++){
			int num1=num;
			for(int j=row;j>=i;j--){
				
				if(i%2==1){
					System.out.print(num1-- + " " );
				}else{
					System.out.print((char)(num1+64) + " ");	
					 num1--;
				}
			}
			num--;
			System.out.println();
		}	
	}		
}

