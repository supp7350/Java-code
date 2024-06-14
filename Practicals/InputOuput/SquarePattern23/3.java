/*
import java.util.*;
class Demo3{
	public static void main(String [] args){
			Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();
		
		int num = row;
		int num1=1;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(i%2==1){
					if(j%2==1){
						System.out.print((char)(num+96)+ "\t");
						num++;	
					}else{
						System.out.print(num++ + "\t");
					}
					num1++;
				}else{
					if(j%2==0){
						System.out.print((char)(num+96)+ "\t");
						num++;	
					}else{
						System.out.print(num++ + "\t");
					}
				}
			}
			
			System.out.println();
		}
	}
}
*/


import java.util.*;
class Demo3{
	public static void main(String [] args){
			Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();
		
		int num = row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if((i+j)%2==0){
					System.out.print((char)(num+96)+ "\t");
					num++;	
				}else{
					System.out.print(num++ + "\t");
			}
		}	System.out.println();
		}
	}
}


