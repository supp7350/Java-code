import java.util.*;
class Demo3{
	public static void main(String [] arsg){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter size of array :");
		int size = sc.nextInt();

		int arr[] = new int [size];

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		System.out.print("Enter key : ");
		int num = sc.nextInt();
		
		int count =0; 
		for(int i=0;i<arr.length;i++){
			if(num==arr[i]){
				count++;
			}
		}
			
		if(count>2){
			for(int i=0;i<arr.length;i++){
				if(num==arr[i]){
					System.out.print(num*num*num + ",");
				}else{
					System.out.print(arr[i]+",");
				}
			}

		}else{
			System.out.println("eLEMENT NOT FOUND.");
		}
	}
}

