import java.util.*;
class Demo3{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int size = sc.nextInt();

		int arr[] = new int [size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
	
/*		for(int i=0;i<arr.length;i++){
			
			if(max1<arr[i]){
				max1=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]<max1 && arr[i]>max2){
				max2 = arr[i];
			}
		}
*/
	
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max1){
				max2 = max1;
				max1 = arr[i];
			}
			else if(arr[i]<max1 && arr[i]>max2){
				max2 = arr[i];
			}
		}
		if(size<2){
                        System.out.println("Array need minimum 2 elements to 2nd largest element ");
                        
                }else{
			System.out.println("Second largest element of array is : "+ max2);
		}
	}
}

