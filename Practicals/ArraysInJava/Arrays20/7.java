import java.util.*;
class Demo7{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array :: ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		System.out.println("Array ellements are :: ");	
		for(int i=0;i<arr.length;i++){
			if(size%2==0){
				if(i%2==0){
					System.out.println(arr[i]);
				}
			}else{
				System.out.println(arr[i]);
			}
		}	
	}
}

