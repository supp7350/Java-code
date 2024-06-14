import java.util.*;
class Demo8{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of aray : ");
		int size =sc.nextInt();

		char arr[] =new char[size];

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.next().charAt(0);
		}
		
		char arr1[] = new char [size];

	
		System.out.print("Reversed array is : ");
		for(int i=0;i<arr.length;i++){
			arr1[i]=arr[size-1-i];
			System.out.print(arr1[i]+",");
		}
		System.out.println();
		System.out.print("Before Reverse : ");
		for(int i=0;i<arr.length;i++){
			if(i%2==0){
				System.out.print(arr[i]+",");
			}
		}

		System.out.println();
		System.out.print("After Reverse : ");
		for(int i=0;i<arr.length;i++){
			if(i%2==0){
				System.out.print(arr1[i]+",");
			}
		}
		System.out.println();

/*			
		for(int i=0;i<size;i++){
			System.out.print(arr[i] +",");	
			if(i%2==0){
				System.out.print(arr[i]+",");
			}
		}
		System.out.println();
		for(int i=size-1;i>=0;i--){
			System.out.print(arr[i]+",");
			if(i%2==0){
				System.out.print(arr[i]+",");
			}	
		}
*/
	}
}

