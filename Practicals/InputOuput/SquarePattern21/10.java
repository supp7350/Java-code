import java.util.*;
class Demo10{
	public static void main(String [] args){
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();
	
		for(int i=1;i<=row;i++){
			int num1 = row;
			for(int j=1;j<=row;j++){
				if(i%2==0 || j%2==0){
					System.out.print((char)(num1+64) +"\t");
					num1--;
				}else{
					System.out.print(num1 +"\t");
					num1--;
				}
			}
			System.out.println();
		}
	}
}



