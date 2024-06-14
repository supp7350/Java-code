import java.util.*;
class Demo1{
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter size of rows :");
		int row = sc.nextInt();

		int col = 0;
		for(int i=1;i<row*2;i++){
			if(i<=row){
				col = i;
			}else{
				col = col-1;
			}
			for(int j=1;j<=col;j++){
				System.out.print("#\t");
			}
			System.out.println();
		}
		
	}
}

