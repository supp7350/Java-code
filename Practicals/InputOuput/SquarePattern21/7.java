/*
import java.util.*;
class Demo7{
	public static void main(String [] args){
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();

		int count =0;
		if(row%2==0){
			count =0;
		}else{
			count =1;
		}
		int num=row;
		for(int i=1;i<=row;i++){
			for(int j=row;j>=1;j--){
				if(count%2==0){
					System.out.print(num +"\t");
					num++;
					count++;
				}else{
					System.out.print((char)(i+64) +"\t");
					num++;
					count++;
				}
			}
			System.out.println();
		}
	}
}
*/

import java.util.*;
class Demo7{
	public static void main(String [] args){
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();
		
		int num=row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(num%2==1){
					System.out.print((char)(64+i) +"\t");
					num++;
				}else{
					System.out.print(num++ +"\t");
				}
			}
			System.out.println();
		}
	}
}



