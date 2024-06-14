import java.util.*;
class Demo10{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int size = sc.nextInt();

		int arr[] = new int [size];

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++){
			int num= arr[i];
			int temp=1;
			while(num>=1){
				temp=temp*num;
				num--;
			}
			
			System.out.print(temp +",");
		}
	}
}

