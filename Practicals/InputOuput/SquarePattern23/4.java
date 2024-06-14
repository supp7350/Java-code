import java.util.*;
class Demo4{
	public static void main(String [] args){
			Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();
		
	
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(j%2==0&&i%2==0){
					System.out.print("$" + "\t");
				}else{
					System.out.print("&"+ "\t");
				}
			}
			System.out.println();
		}
	}
}

