import java.util.*;
class Demo2{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int size = sc.nextInt();

		int arr [] =new int [size];
		
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		int maxnum =arr[0];
		int minnum =arr[0];
		for(int i=0;i<arr.length;i++){
			
			if(maxnum<arr[i]){
				maxnum = arr[i];
			}
			if(minnum>arr[i]){
				minnum=arr[i];
			}
		}
		
		System.out.println("Difference between maximum and minimum element is : "+(maxnum-minnum));
	}
}

