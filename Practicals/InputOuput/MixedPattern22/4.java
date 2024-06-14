import java.util.*;
class Demo4{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();
		
		int num;
		if(row%2==0){
			num=96;
		}else{
			num=64;
		}
		
		for(int i=1;i<=row;i++){
			int num2 =1;;
			for(int k=1;k<i;k++){
				System.out.print("\t");
				num2++;
			}
			for(int j=row;j>=i;j--){
				System.out.print((char)(num2+num) + "\t");
				num2++;
			}
			System.out.println();
			
		}
	}
}

