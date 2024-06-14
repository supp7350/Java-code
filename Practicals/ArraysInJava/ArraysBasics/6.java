import java.util.*;
class Demo6{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
		int size = sc.nextInt();

		char arr[] = new char[size];
		
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.next().charAt(0);
		}
		
		System.out.print("Output : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println();
	}
}


