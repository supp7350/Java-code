import java.util.*;
class Demo10{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array :: ");
		int size = sc.nextInt();

		int arr[] = new int[size];
	
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		

		int product=1;
		for(int i=0;i<arr.length;i++){
			int count=0;
			int temp=1;
			while(temp<=arr[i]){
				if(arr[i]%temp==0){
					count++;
				}
				temp++;
			}	
			
			
			if(count<=2){
				product = product*arr[i];	
			}
		}
		if(product ==1){
			System.out.println("Product : 0 ");
		}else{
			System.out.println("Product : "+product);
		}
	}
}


