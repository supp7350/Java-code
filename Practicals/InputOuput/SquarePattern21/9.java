import java.util.*;
class Demo9{
	public static void main(String [] args){
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();

		for(int i=1;i<=row;i++){
			int num1 = 2;
			int num2 = 3; 
			for(int j=1;j<=row;j++){
				if((i+j)%2==0){
					System.out.print(num1*j +"\t");
				}else{
					System.out.print(num2*j +"\t");
				}
			}
			System.out.println();
		}
	}
}



