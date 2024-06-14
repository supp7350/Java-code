import java.util.*;
class Demo3{
	public static void main(String [] args){
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();

		int num1= row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(j==1){
					System.out.print(num1*num1 + "\t");
					num1++;
				}else{
					System.out.print(num1++ + "\t");
				}
			}
				System.out.println();
		}
	}
}

