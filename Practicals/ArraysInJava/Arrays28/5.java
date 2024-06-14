import java.util.*;
class Demo5{
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

		int size = arr1.length + arr2.length;
		
		int arr3[]= new int [size];
	
		int index=0;
		for(int i=0;i<arr3.length;i++){

			if(i<arr1.length){
				arr3[i]=arr1[i];
				System.out.print(arr3[i]+",");
			}else{
				
				arr3[i]=arr2[index];
				index++;
				System.out.print(arr3[i]+",");
			}
		}
				
	}
}

