import java.util.*;
class Demo10{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int size = sc.nextInt();

		int arr[] = new int [size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		if(size<3){
			System.out.println("Enter size more than 3 to check third largest number!!");
			return;
		}
		int max1=Integer.MIN_VALUE;
		int max2= Integer.MIN_VALUE;
                int max3= Integer.MIN_VALUE;
/*
		for(int i=0;i<arr.length;i++){			
			if(max1<arr[i]){
				max1=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]<max1 && arr[i]>max2){
				max2 = arr[i];
			}
		}
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]<max1 && arr[i]<max2 && arr[i]>max3){
				max3 = arr[i];
			}
		}
		
*/			
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max1){
				max3=max2;
				max2=max1;
				max1=arr[i];
			}else if(max1>arr[i]&& arr[i]>max2){
				max3=max2;
				max2=arr[i];
			}else if(max2>arr[i]&& max1>arr[i] && arr[i]>max3){
				max3=arr[i];
			}
		}
		
		System.out.println("Third largest element of array is : "+ max3);
	}
}


