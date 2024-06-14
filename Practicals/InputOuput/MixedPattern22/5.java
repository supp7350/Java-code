/*
import java.util.*;
class Demo5{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();

		int num =3;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(i%2==1){
					System.out.print(num*num + "\t");
					num++;
				}else{
					System.out.print(num++ + "\t");
				}
			}
			System.out.println();
		}
	}
}
*/

import java.util.*;
class Demo5{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();

		int num =3;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(i%3==0 && j%3==0){
					System.out.print(num*num + "\t");
					num=num+2;
				}else if(i%2==1){
					System.out.print(num*num + "\t");
					num++;
				}else{
					System.out.print(num++ + "\t");
				}
			}
			System.out.println();
		}
	}
}

