import java.util.*;
class Demo8{
	public static void main(String [] args){
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();

	
	
		for(int i=1;i<=row;i++){
			int num = row;
			for(int j=1;j<=row;j++){
				if((i+j)%2==0){
					System.out.print("#" +"\t");
				}else{
					System.out.print((char)(64+num) +"\t");
					num--;
				}
			}
			System.out.println();
		}
	}
}



