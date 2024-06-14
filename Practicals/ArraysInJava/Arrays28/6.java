import java.util.*;
class Demo6{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of aray : ");
		int size =sc.nextInt();

		int arr[] =new int[size];

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
	
		
		System.out.print("Enter key : ");
		int num = sc.nextInt();

		
		int count =0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%num==0){
				System.out.println("An element multiple of "+num+"found at index : "+i);
			}else{
				count++;
			}	
		}
		
		if(count == arr.length){
			System.out.println("Element not found ");
		}

	}
}

