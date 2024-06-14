import java.util.*;
class Demo9{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array :: ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		int temp = arr[0];
		for(int i=1;i<arr.length;i++){
			if(temp>arr[i]){
				temp=arr[i];
			}
		}
		System.out.println("Minimum number in the array is : "+temp);	
	}
}

