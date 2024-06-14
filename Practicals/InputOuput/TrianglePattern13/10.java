import java.util.*;
class Demo10{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();
	
		for(int i=row;i>=1;i--){
			int num =64+i;
			for(int j=1;j<=i;j++){
				if(i%2==0){
					System.out.print((char)num-- +" ");
				}else{
					System.out.print((char)(num+32)+" ");
					num--;
				}
			}
			System.out.println();
		}
	}
}

