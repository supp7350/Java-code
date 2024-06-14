import java.util.*;
class Demo9{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row =sc.nextInt();
		
		
		for(int i=1;i<=row;i++){
			for(int k=1;k<i;k++){
				System.out.print("\t");
	//			num++;
			}
			for(int j=(((row-i)*2)+1) ;j>=1;j--){
				if(j%2==0){
					System.out.print("0" + "\t");
				}else{
					System.out.print("1" +"\t");
				}
			}
			System.out.println();
		}
	}
}

