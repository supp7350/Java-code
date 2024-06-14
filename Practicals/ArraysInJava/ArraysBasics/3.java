import java.util.*;
class Demo3{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
		int size = sc.nextInt();	
		
		int arr [] = new int[size];
		
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Even elements of an array are : ");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				System.out.print(arr[i]+",");
			}
		}
		System.out.println();
	}
}

