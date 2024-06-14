import java.util.*;
class Onedarray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int arrsize = sc.nextInt();
		int arr[] = new int[arrsize];
		System.out.println("Enter Elements : ");
		for(int i = 0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i<arr.length; i++){
			System.out.println(arr[i]);
		}

	}
}


