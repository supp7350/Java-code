import java.util.*;
class Demo6{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array :: ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		int product =1;
		for(int i=0;i<arr.length;i++){
			if(i%2==1){
				product*=arr[i];	
			}
		}
		System.out.println("Product of odd indexed elements :: " + product );
		
	}
}

