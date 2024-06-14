import java.util.*;
class Demo1{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of aray : ");
		int size =sc.nextInt();

		int arr[] =new int[size];

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
	
		boolean b = true;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1]){
				b = true ;
			}
			else{
				b=false;
				break;
			}
		}
		
		if(b == true){
			System.out.println("Given aray is in decending order.");
		}else{
			System.out.println("Array is not in decenting order");
		}
	}
}

