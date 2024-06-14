import java.util.*;
class Demo1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();


		int num =1;
		for(int i=1;i<=row;i++){
			for(int k=row;k>i;k--){
				System.out.print("\t");
			}
			for(int j=1;j<=i;j++){
				if(j%2==1 && i%2==0){
					System.out.print(num+ "\t");
					num= num+i;
				}else{
					System.out.print(num + "\t");
					num=num+2;
				}
			}
			System.out.println();
		}
	}
}

