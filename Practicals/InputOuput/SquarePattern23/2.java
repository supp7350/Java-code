import java.util.*;
class Demo2{
	public static void main(String [] args){
			Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();
		
		int num = row;
		int num1=row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(j>=num1){
					System.out.print((char)(num+64) + "\t");
					num++;
				}else{
					System.out.print((char)(num+96)+ "\t");
					num++;
				}
			}
			num1--;
			System.out.println();
		}
	}
}

