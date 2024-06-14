import java.util.*;
class Demo7{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array :: ");
		int size = sc.nextInt();

		int arr[] = new int[size];
	
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		

		
		for(int i=0;i<arr.length;i++){
			if(size>=5 && size%2==1){
				if(arr[i]%2==1){
					System.out.print(arr[i]+"\t");	
				}
			}else{
				if(arr[i]%2==0){
					System.out.print(arr[i]+"\t");	
				}
			}
		}
		System.out.println();
	}
}


