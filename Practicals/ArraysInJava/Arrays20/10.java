import java.util.*;
class Demo10{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array :: ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		int temp = arr[0];
		int num =0;
		for(int i=1;i<arr.length;i++){
			if(temp<arr[i]){
				temp=arr[i];
				num =i;
			}
		}
		System.out.println("Maximum number in the array is found at pos "+ num +" is "+temp);	
	}
}

