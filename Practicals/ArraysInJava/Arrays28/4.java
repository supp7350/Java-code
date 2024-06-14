import java.util.*;
class Demo4{
	public static void main(String [] arsg){
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter size of array1 :");
		int size1 = sc.nextInt();

		int arr1[] = new int [size1];

		for(int i=0;i<arr1.length;i++){
			arr1[i]=sc.nextInt();
		}

		System.out.print("Enter size of array2 :");
		int size2 = sc.nextInt();
		
		int arr2[] = new int [size2];

		for(int i=0;i<arr2.length;i++){
			arr2[i]=sc.nextInt();
		}

		
	
		for(int i=0;i<arr1.length;i++){
			int count =0;
			int num	=arr1[i];
	
			for(int j=0;j<arr2.length;j++ ){
				if(arr1[i]==arr2[j]){
					count++;
				}
			}
				
			if(count>=1){
				System.out.print(arr1[i]+ ",");
			}
		}
				
	}
}

