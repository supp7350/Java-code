import java.util.*;
class Demo2{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
		int size =sc.nextInt();

		int arr [] = new int[size];
		
		for(int i =0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Output : ");
		for(int i =0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println();
	}
}

