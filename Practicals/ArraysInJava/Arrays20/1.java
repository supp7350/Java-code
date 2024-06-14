import java.util.*;
class Demo1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array :: ");
		int size = sc.nextInt();

		
		int arr [] = new int[size];
		
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		int count = 0;
		
		System.out.print("Even numbers : ");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				count++;
				System.out.print(arr[i] +" ");
			}
		}
		System.out.println();
		System.out.println("Count of even elements is :: " + count);
	}
}

