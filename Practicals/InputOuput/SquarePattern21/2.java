import java.util.*;
class Demo2{
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();

		int num = row;
		for(int i=1;i<=row;i++){
			for(int j=row;j>=1;j--){
				if(num%3==0){
					System.out.print(num*3 + "\t");
					num++;
				}else if(num%5==0){
					System.out.print(num*5 + "\t");
					num++;
				}else{
					System.out.print(num++ + "\t");
				}
			}
			System.out.println();
		}
	}
}

