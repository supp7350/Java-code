import java.util.*;
class Demo10{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row =sc.nextInt();
		
		
		for(int i=1;i<=row;i++){
			int num =row;
			for(int k=1;k<i;k++){
				System.out.print("\t");
				num--;
			}
			for(int j=(((row-i)*2)+1) ;j>=1;j--){
				if(j>(row-i)+1){
					System.out.print(num-- + "\t");
				}else{
					System.out.print(num++ +"\t");
				}
			}
			System.out.println();
		}
	}
}

