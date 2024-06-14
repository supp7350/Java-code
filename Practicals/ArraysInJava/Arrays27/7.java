import java.util.*;
class Demo6{
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
			int temp=1;
			
			while(temp<=arr[i]){
				if(arr[i]%temp==0){
					count++;
				}
				temp++;
			}
			
				
				
			if(count==2){
				System.out.println("First prime number found at index " + i);
				break;
			}
	
			if(count==1){
				continue;
			}
		
		}
		
	}
}

