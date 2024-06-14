import java.util.*;
class Demo6{
	public static void main(String [] args){
			Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();
		
		
		for(int i=1;i<=row;i++){
			int num = row*row;
			for(int j=1;j<=row;j++){
				if( i%2==1 ){
					System.out.print(num-- + "\t");
				}else if(j%2==1 && i%2==0){
					System.out.print(num + "\t");	
					num= num-5;
				}else{
					System.out.print(num + "\t");
				}
			}
			System.out.println();
		}
	}
}

