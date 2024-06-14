import java.util.*;
class Demo8{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
	
	/*	for(int i=0;i<arr.length;i++){
			if(min1>arr[i]){
				min1=arr[i];
			}
		}
	
		
		for(int i=0;i<arr.length;i++){
			if(min1<arr[i] && min2>arr[i]){
				min2 = arr[i];
			}
		}
	*/
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min1){
				min2=min1;
				min1=arr[i];
			}
			else if(arr[i]>min1 && arr[i]<min2){
				min2=arr[i];
			}
		}
	
		if(size<2){
			System.out.println("Enter size more than 2");
		}else{	
			System.out.println("Second minimum element in an array is : "+min2);
		}
	}
}

