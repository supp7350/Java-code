import java.util.*;
class Demo1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		int count =0;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]<=arr[i+1]){
				count++;	
			}
		}
		if(count==arr.length-1){
			System.out.println("Given array is in ascending order ");
		}else{
			System.out.println("Given array is not in ascending order");
		}
	}
}

