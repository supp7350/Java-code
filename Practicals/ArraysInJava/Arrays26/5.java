import java.util.*;
class Demo5{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int size = sc.nextInt();
			
		int arr[] = new int [size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		
	/*	int temp;
		for(int i=0;i<arr.length/2;i++){
			temp=arr[i];
			arr[i]=arr[size-1-i];
			arr[size-1-i]=temp;
		}
		System.out.println("Reverse is : ")
		for(int i=0;i<arr.length;i++){	
			System.out.println(arr[i]);
		} */

		for(int i=(arr.length-1);i>=0;i--){
			System.out.println(arr[i]);
		}
	}
}

