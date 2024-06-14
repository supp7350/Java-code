import java.util.*;
class Demo7{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row =sc.nextInt();
		
		
		for(int i=1;i<=row;i++){
			int num =65;
			for(int k=1;k<i;k++){
				System.out.print("\t");
			}
			for(int j=(((row-i)*2)+1) ;j>=1;j--){
				if(j>(row-i)+1){
					System.out.print((char)num++ + "\t");
				}else{
					System.out.print((char)num-- +"\t");
				}
			}
			System.out.println();
		}
	}
}

