import java.util.*;
class Demo5{
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter size of rows :");
		int row = sc.nextInt();

		int col = 0;
		int num = row+1+64;
		for(int i=1;i<row*2;i++){
			if(i<=row){
				col = i;
				num--;
			}else{
				col = col-1;
				num++;
			}
			for(int j=1;j<=col;j++){
				System.out.print((char)num +"\t");
			}
			System.out.println();
		}
		
	}
}

