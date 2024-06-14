import java.util.*;
class Demo4{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array :: ");
		int size = sc.nextInt();

		int arr[] =new int [size];
		
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Enter the number to search in array :: " );
		int num = sc.nextInt();

		for(int i=0;i<arr.length;i++){
			if(arr[i]==num){
				System.out.println(arr[i] + " found at index " + i);
			}
		}
	}
}

