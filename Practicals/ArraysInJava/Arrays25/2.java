import java.util.*;
class Demo2{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array :: ");
		int size = sc.nextInt();

		int arr[] = new int[size];
	
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter specific number : ");
		int num=sc.nextInt();

		int index=-1;
		for(int i=0;i<arr.length;i++){
			if(num==arr[i]){
				index=i;
				break;	
			}
		}
		if(index==-1){
			System.out.println("num "+num+" not found in array.");
		}else{
			System.out.println("num "+num+" first occurred at index "+ index);
		}
	}
}

