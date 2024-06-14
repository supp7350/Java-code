import java.util.*;
class Demo3{
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
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(num==arr[i]){
				index=i;
				count++;	
			}
		}
		if(index==-1){
			System.out.println("num "+num+" not found in array.");
		}else{
			System.out.println("Number "+num+" occurred " + count + " times in array.");
		}
	}
}


