import java.util.*;
class Demo4{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array :: ");
		int size = sc.nextInt();

		int arr[] = new int[size];
	
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		

		
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				arr[i]=0;
				System.out.print(arr[i]+"\t");	
			}else{
				arr[i]=1;
				System.out.print(arr[i]+"\t");
			}
		}
		System.out.println();
	}
}


