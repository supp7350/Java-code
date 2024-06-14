import java.util.*;
class Demo5{
	public static void main(String [] args){
			
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();
		
		
		for(int i =1;i<=row;i++){
			char ch = 'A';
			for(int j=row;j>=i;j--){
				if(i%2==1){
					System.out.print(ch++ + " " );
				}else{
					System.out.print((char)((int)ch+32) + " ");
					ch++;
				}
			}
			System.out.println();
		}	
	}		
}

