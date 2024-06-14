import java.util.*;
class Demo7{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of aray : ");
		int size =sc.nextInt();

		int arr[] =new int[size];

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

	
		System.out.print("array :" );	
		for(int i=0;i<arr.length;i++){
			if(arr[i]>=65 && arr[i]<=90){
				System.out.print((char)arr[i] +",");
			}else{
				System.out.print(arr[i]+",");
			}	
		}
		System.out.println();
	}
}

