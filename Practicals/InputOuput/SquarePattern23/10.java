import java.util.*;
class Demo10{
	public static void main(String [] args){
			Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();
		
		int num=row*row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if( j==i ){
					System.out.print("$"+ "\t");
					num--;
				}else if(j==1){
					System.out.print(num-- + "\t");
				}else{
					System.out.print(num*j + "\t");
					num--;
				}
			}
			System.out.println();
		}
	}
}

