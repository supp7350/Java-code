import java.util.*;
class Demo5{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		
	
	
		for(int i=0;i<arr.length;i++){
			
			int count=0;
			int temp=arr[i];
			
			while(temp>0){
				count++;
				temp=temp/10;
			}	
			
			System.out.print(count + ",");
		
		}
		System.out.println();

		
	}
}

